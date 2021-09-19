package com.moascode.topbuslines.journey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JourneyPatternPoint {
    @JsonProperty("LineNumber")
    Integer LineNumber;

    @JsonProperty("JourneyPatternPointNumber")
    Integer JourneyPatternPointNumber;

    public Integer getLineNumber() {
        return LineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        LineNumber = lineNumber;
    }

    public Integer getJourneyPatternPointNumber() {
        return JourneyPatternPointNumber;
    }

    public void setJourneyPatternPointNumber(Integer journeyPatternPointNumber) {
        JourneyPatternPointNumber = journeyPatternPointNumber;
    }
}
