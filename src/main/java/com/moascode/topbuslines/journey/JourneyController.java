package com.moascode.topbuslines.journey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("http://localhost:3000/")
public class JourneyController {

    @Autowired
    private JourneyService journeyService;

    @GetMapping("/top-bus-lines")
    public List<Line> getTopBusLines(){
        return journeyService.getTopBusLines();
    }


}
