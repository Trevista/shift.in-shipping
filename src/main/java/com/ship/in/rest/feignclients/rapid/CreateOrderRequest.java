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
public class CreateOrderRequest {

    @JsonProperty("client") 
    public String client;

    @JsonProperty("token") 
    public String token;

    @JsonProperty("oid") 
    public String orderId;

    @JsonProperty("consignee") 
    public String consignee;

    @JsonProperty("add1") 
    public String address1;

    @JsonProperty("add2") 
    public String address2;

    @JsonProperty("pin") 
    public int pin;

    @JsonProperty("city") 
    public String city;

    @JsonProperty("state") 
    public String state;

    @JsonProperty("country") 
    public String country;

    @JsonProperty("phone") 
    public long phone;

    @JsonProperty("weight") 
    public int weight;

    @JsonProperty("mode") 
    public String mode;

    @JsonProperty("amt") 
    public int amount;

    @JsonProperty("ret_add") 
    public String returnAddress;

    @JsonProperty("ship_pin") 
    public int shipperPincode;

    @JsonProperty("ship_phone") 
    public long shipperPhone;

    @JsonProperty("ship_company") 
    public String shipperCompany;

    @JsonProperty("product") 
    public String product;

    @JsonProperty("Hub_id") 
    public Object hubId;   
}
