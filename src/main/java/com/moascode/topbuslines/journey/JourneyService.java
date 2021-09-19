package com.moascode.topbuslines.journey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class JourneyService {

    @Autowired
    private JourneyClient journeyClient;

    private static Map<Integer, String> stopPointNameByNumber = new HashMap<Integer, String>();

    public List<Line> getTopBusLines(){

        List<JourneyPatternPoint> journeyPatternPoints = journeyClient.getJourneyPatternPoints();

        // Prepare Lines map
        Map<Integer, List<JourneyPatternPoint>> lineByLineNumber = journeyPatternPoints.stream()
                .collect(Collectors.groupingBy(
                        JourneyPatternPoint::getLineNumber,
                        Collectors.mapping(
                                Function.identity(), Collectors.toList()
                        )));

        // create counts map - TODO Sort at the same time
        Map<Integer, Long> countsMap = journeyPatternPoints.stream().collect(
                Collectors.groupingBy(JourneyPatternPoint::getLineNumber, Collectors.counting()));

        // Create sorted map
        LinkedHashMap<Integer, Long> sortedMap = new LinkedHashMap<>();
        countsMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        // Get top ten from sorted map
        List<Integer> topTenLines = sortedMap.entrySet().stream()
                .map(Map.Entry::getKey)
                .limit(10)
                .collect(Collectors.toList());

        // Prepare response data - Lines with stops
        List<Line> lines = new ArrayList<>();
        for (Integer line : topTenLines) {
            List<Stop> stops = new ArrayList<>();
            lineByLineNumber.get(line).stream().forEach(
                    s -> stops.add( new Stop(s.getLineNumber(),getStopPointsMap().get(s.getJourneyPatternPointNumber())))
            );
            lines.add(new Line(line, line, stops));
        }
        return lines;
    }

    public Map<Integer, String> getStopPointsMap(){
        if(stopPointNameByNumber.isEmpty()){
            List<StopPoint> stopPoints = journeyClient.getStopPoints();
            stopPointNameByNumber = stopPoints.stream().collect(Collectors.toMap(StopPoint::getStopPointNumber, StopPoint::getStopPointName));
        }
        return stopPointNameByNumber;
    }

}
