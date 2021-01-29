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
public class Consignee {

    @JsonProperty("City") 
    public String city;
    
    @JsonProperty("Name") 
    public String name;

    @JsonProperty("Country") 
    public String country;

    @JsonProperty("Address2") 
    public List<Object> address2;

    @JsonProperty("Address3") 
    public String address3;

    @JsonProperty("PinCode") 
    public int pinCode;

    @JsonProperty("State") 
    public String state;

    @JsonProperty("Telephone2") 
    public String telephone2;

    @JsonProperty("Telephone1") 
    public String telephone1;
    
    @JsonProperty("Address1") 
    public List<String> address1;
}
