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
public class ShipmentData {

    @JsonProperty("Shipment") 
    public DelhiveryShipmentResponse shipment;
}
