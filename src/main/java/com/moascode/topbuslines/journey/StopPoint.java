package com.moascode.topbuslines.journey;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopPoint {
    @JsonProperty("StopPointNumber")
    Integer StopPointNumber;

    @JsonProperty("StopPointName")
    String StopPointName;

    public Integer getStopPointNumber() {
        return StopPointNumber;
    }

    public void setStopPointNumber(Integer stopPointNumber) {
        StopPointNumber = stopPointNumber;
    }

    public String getStopPointName() {
        return StopPointName;
    }

    public void setStopPointName(String stopPointName) {
        StopPointName = stopPointName;
    }
}
