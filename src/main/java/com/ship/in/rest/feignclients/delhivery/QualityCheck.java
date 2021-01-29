package com.ship.in.rest.feignclients.delhivery;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QualityCheck {
    @JsonProperty("item")
    List<QualityItems> item;
}

class QualityItems{
    @JsonProperty("images")
    public String images;

    @JsonProperty("color")
    public String color;

    @JsonProperty("reason")
    public String reason;

    @JsonProperty("descr")
    public String description;

    @JsonProperty("ean")
    public String ean;

    @JsonProperty("imei")
    public String imei;

    @JsonProperty("brand")
    public String brand;

    @JsonProperty("pcat")
    public String productCategory;

    @JsonProperty("si")
    public String specialInstructions;
}
