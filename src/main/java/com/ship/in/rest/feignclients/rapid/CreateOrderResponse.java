package com.ship.in.rest.feignclients.rapid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOrderResponse {
    
    @JsonProperty("waybill")
    public String waybill;

    @JsonProperty("mode")
    public String mode;

    @JsonProperty("order_id")
    public String orderId;

    @JsonProperty("status")
    public String status;

}
