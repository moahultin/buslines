package com.moascode.topbuslines.journey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StopPointData {

    @JsonProperty("Result")
    List<StopPoint> Result;

    public List<StopPoint> getResult() {
        return Result;
    }

    public void setResult(List<StopPoint> result) {
        Result = result;
    }
}
