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
public class PickupOrderRequest {
    
    @JsonProperty("token") 
    public String token;

    @JsonProperty("client") 
    public String client;

    @JsonProperty("day") 
    public String day;

    @JsonProperty("address") 
    public String address;

    @JsonProperty("pincode") 
    public String pincode;

    @JsonProperty("name") 
    public String name;

    @JsonProperty("shipments") 
    public String shipmentCount;

    @JsonProperty("weight") 
    public String weight;

    @JsonProperty("phone") 
    public String phone;
}
