package com.ship.in.rest.feignclients.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Scan {
    
    @JsonProperty("ScanDetail") 
    public ScanDetail scanDetail;
}
