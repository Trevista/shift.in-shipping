package com.ship.in.rest.feignclients.rapid;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackResponse {

    @JsonProperty("status")
    public String status;

    @JsonProperty("flow")
    public String flow;

    @JsonProperty("code")
    public String code;

    @JsonProperty("expected_delivery")
    public String expectedDelivery;

    @JsonProperty("scans")
    public List<TrackScanDetails> trackingScans;
    
}
