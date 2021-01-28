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
public class EditResponse {
    
    @JsonProperty("status")
    public String status;

    @JsonProperty("waybill")
    public String waybill;

    @JsonProperty("order_id")
    public String orderId;

    @JsonProperty("error")
    public String error;

}
