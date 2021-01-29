package com.ship.in.rest.feignclients.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CancelOrderRequest {
    
    @JsonProperty("waybill") 
    public String waybill;

    @JsonProperty("cancellation") 
    public boolean isCancel;
}
