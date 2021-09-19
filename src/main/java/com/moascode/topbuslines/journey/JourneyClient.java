package com.moascode.topbuslines.journey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class JourneyClient {

    @Autowired
    private RestTemplate restTemplate;

    private static String journeyPatternPointUrl = "https://api.sl.se/api2/LineData.json?key=72eeb6cee26245a8b7fc86aa719850ae&model=JourneyPatternPointOnLine";
    private static String stopPointsUrl = "https://api.sl.se/api2/LineData.json?key=72eeb6cee26245a8b7fc86aa719850ae&model=StopPoint";

    public List<JourneyPatternPoint> getJourneyPatternPoints(){
        JourneyResponse journeyPoints = restTemplate.getForObject(journeyPatternPointUrl, JourneyResponse.class);
        return journeyPoints.getResponseData().getResult();
    }

    public List<StopPoint> getStopPoints(){
        StopPointResponse stopPoints = restTemplate.getForObject(stopPointsUrl, StopPointResponse.class);
        return stopPoints.getResponseData().getResult();
    }
}
