package com.ship.in.rest.feignclients.delhivery;

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
public class CreateDelhiveryOrder {
    
    @JsonProperty("pickup_location")
    public PickupLocation pickupLocation;

    @JsonProperty("shipments")
    public List<Package> shipments;
}
