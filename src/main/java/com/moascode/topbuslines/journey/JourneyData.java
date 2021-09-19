package com.moascode.topbuslines.journey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JourneyData {

    @JsonProperty("Result")
    List<JourneyPatternPoint> Result;

    public List<JourneyPatternPoint> getResult() {
        return Result;
    }

    public void setResult(List<JourneyPatternPoint> result) {
        Result = result;
    }
}
