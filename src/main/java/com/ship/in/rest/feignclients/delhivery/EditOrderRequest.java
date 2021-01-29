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
public class EditOrderRequest {

    @JsonProperty("tax_value") 
    public String taxValue;

    @JsonProperty("shipment_width") 
    public int shipmentWidth;

    @JsonProperty("product_category") 
    public String productCategory;

    @JsonProperty("waybill") 
    public String waybill;

    @JsonProperty("consignee_tin") 
    public String consigneeTin;

    @JsonProperty("phone") 
    public String consigneePhoneNumber;

    @JsonProperty("stax_ack_number") 
    public String staxAcknowledgeNumber;

    @JsonProperty("gm") 
    public int packageWeight;

    @JsonProperty("shipment_length") 
    public int packageLength;

    @JsonProperty("shipment_height") 
    public int packageHeight;

    @JsonProperty("commodity_value") 
    public String commodityValue;

    @JsonProperty("name") 
    public String consigneeName;

    @JsonProperty("product_details") 
    public String productDetails;

    @JsonProperty("add") 
    public String consigneeAddress;

    @JsonProperty("pt") 
    public String paymentMode;

    
    @JsonProperty("cancellation") 
    public boolean isCancel;
}
