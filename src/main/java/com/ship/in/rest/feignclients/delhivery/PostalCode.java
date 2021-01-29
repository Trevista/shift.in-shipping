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
public class PostalCode {
    
    @JsonProperty("inc")
    public Object inc;

    @JsonProperty("covid_zone")
    public String covidZone;

    @JsonProperty("pin")
    public int pinCode;

    @JsonProperty("max_amount")
    public double maxAmount;

    @JsonProperty("pre_paid")
    public String prepaid;

    @JsonProperty("cash")
    public String cash;

    @JsonProperty("pickup")
    public String pickup;

    @JsonProperty("repl")
    public String repl;

    @JsonProperty("cod")
    public String cod;

    @JsonProperty("country_code")
    public String countryCode;

    @JsonProperty("sort_code")
    public String sortCode;

    @JsonProperty("is_oda")
    public String isOda;

    @JsonProperty("district")
    public String district;

    @JsonProperty("state_code")
    public String stateCode;

    @JsonProperty("max_weight")
    public double maxWeight;

}
