package com.ship.in.rest.feignclients.rapid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackScanDetails {
    
    @JsonProperty("flow")
    public String flow;

    @JsonProperty("status")
    public String status;

    @JsonProperty("timestamp")
    public String timestamp;

    @JsonProperty("remarks")
    public String remarks;

}
