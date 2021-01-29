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
public class Package {

    @JsonProperty("add")
    public String consigneeAddress;

    @JsonProperty("address_type")
    public String addressType;

    @JsonProperty("phone")
    public long consigneePhoneNumber;

    @JsonProperty("payment_mode")
    public PaymentMode paymentMode;

    @JsonProperty("name")
    public String consigneeName;

    @JsonProperty("pin")
    public int consigneePincode;

    @JsonProperty("order")
    public String orderId;

    @JsonProperty("consignee_gst_amount")
    public String consigneeGstAmount;

    @JsonProperty("integrated_gst_amount")
    public String integratedGstAmount;

    @JsonProperty("ewbn")
    public String ewayBillNumber;

    @JsonProperty("consignee_gst_tin")
    public String consigneeGstTin;

    @JsonProperty("seller_gst_tin")
    public String sellergstTin;

    @JsonProperty("client_gst_tin")
    public String clientGstTin;

    @JsonProperty("hsn_code")
    public String hsnCode;

    @JsonProperty("gst_cess_amount")
    public String gstCessAmount;

    @JsonProperty("client")
    public String client;

    @JsonProperty("tax_value")
    public String taxValue;

    @JsonProperty("seller_tin")
    public String sellerTin;

    @JsonProperty("seller_gst_amount")
    public String sellerGstAmount;

    @JsonProperty("seller_inv")
    public String sellerInvoice;

    @JsonProperty("city")
    public String city;

    @JsonProperty("commodity_value")
    public String commodityValue;

    @JsonProperty("weight")
    public String packageWeight;

    @JsonProperty("return_state")
    public String returnState;

    @JsonProperty("document_number")
    public String ewayDocNumber;

    @JsonProperty("od_distance")
    public String o2dDistance;

    @JsonProperty("sales_tax_form_ack_no")
    public String salesTaxAcknowledgeNo;

    @JsonProperty("document_type")
    public String documentType;

    @JsonProperty("seller_cst")
    public String sellerCst;

    @JsonProperty("seller_name")
    public String sellerName;

    @JsonProperty("fragile_shipment")
    public boolean isFragile;

    @JsonProperty("return_city")
    public String returnCity;

    @JsonProperty("return_phone")
    public String returnPhoneNumber;

    @JsonProperty("qc")
    public QualityCheck returnQualityCheck;

    @JsonProperty("shipment_height")
    public double packageHeight;

    @JsonProperty("shipment_width")
    public double packageWidth;

    @JsonProperty("shipment_length")
    public double packageLength;

    @JsonProperty("category_of_goods")
    public String categoryofGoods;

    @JsonProperty("cod_amount")
    public double codAmount;

    @JsonProperty("return_country")
    public String returnCountry;

    @JsonProperty("document_date")
    public String documentDate;

    @JsonProperty("taxable_amount")
    public double taxableAmount;

    @JsonProperty("products_desc")
    public String productsDescription;

    @JsonProperty("state")
    public String state;

    @JsonProperty("dangerous_good")
    public boolean isDangerous;

    @JsonProperty("waybill")
    public String waybill;

    @JsonProperty("consignee_tin")
    public String consigneeTin;

    @JsonProperty("order_date")
    public String orderDate;

    @JsonProperty("return_add")
    public String returnAddress;

    @JsonProperty("total_amount")
    public double totalAmount;

    @JsonProperty("seller_add")
    public String sellerAddress;

    @JsonProperty("country")
    public String country;

    @JsonProperty("return_pin")
    public String returnPincode;

    @JsonProperty("extra_parameters")
    public ReturnReasonObj returnReasons;

    @JsonProperty("return_name")
    public String returnName;

    @JsonProperty("supply_sub_type")
    public String ewayBillSupplySubType;

    @JsonProperty("plastic_packaging")
    public String isPlasticPackage;

    @JsonProperty("quantity")
    public String quantity;  
}

class ReturnReasonObj {
    @JsonProperty("return_reason")
    public String returnReason;
}
