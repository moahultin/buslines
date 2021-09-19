package com.moascode.topbuslines.journey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StopPointResponse {

    @JsonProperty("ResponseData")
    StopPointData ResponseData;

    public StopPointData getResponseData() {
        return ResponseData;
    }

    public void setResponseData(StopPointData responseData) {
        ResponseData = responseData;
    }
}
