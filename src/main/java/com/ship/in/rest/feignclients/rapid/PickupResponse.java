package com.ship.in.rest.feignclients.rapid;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PickupResponse {

    @JsonProperty("Pickup") 
    public List<Pickup> pickup;
    
}
