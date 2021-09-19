package com.moascode.topbuslines.journey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JourneyResponse {

    @JsonProperty("ResponseData")
    JourneyData JourneyData;

    public JourneyData getResponseData() {
        return JourneyData;
    }

    public void setResponseData(JourneyData responseData) {
        JourneyData = responseData;
    }
}

