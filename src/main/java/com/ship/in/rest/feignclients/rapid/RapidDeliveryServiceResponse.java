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
public class RapidDeliveryServiceResponse {
    
    @JsonProperty("pincode_data")
    public List<PincodeData> pincodeData;
}
