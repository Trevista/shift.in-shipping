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
public class PincodeData {
    
    @JsonProperty("cod")
    public String cashOnDelivery;

    @JsonProperty("prepaid")
    public String prepaid;

    @JsonProperty("city")
    public String city;

    @JsonProperty("state")
    public String state;

    @JsonProperty("value_cap")
    public String valueCap;

    @JsonProperty("network")
    public String network;

}
