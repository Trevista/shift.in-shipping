package com.ship.in.rest.feignclients.delhivery;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DelhiveryStatus {

    @JsonProperty("Status") 
    public String status;

    @JsonProperty("StatusLocation") 
    public String statusLocation;

    @JsonProperty("StatusDateTime") 
    public Date statusDateTime;

    @JsonProperty("RecievedBy") 
    public String recievedBy;

    @JsonProperty("Instructions") 
    public String instructions;

    @JsonProperty("StatusType") 
    public String statusType;
    
    @JsonProperty("StatusCode") 
    public String statusCode;
}
