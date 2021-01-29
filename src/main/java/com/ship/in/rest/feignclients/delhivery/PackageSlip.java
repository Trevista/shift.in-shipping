package com.ship.in.rest.feignclients.delhivery;

import java.util.Date;
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
public class PackageSlip {

    @JsonProperty("origin")
    public String origin;

    @JsonProperty("invoice_reference")
    public Object invoiceReference;

    @JsonProperty("shipment_width")
    public double shipmentWidth;

    @JsonProperty("pin")
    public int pinCode;

    @JsonProperty("cl")
    public String client;

    @JsonProperty("intl")
    public Object international;

    @JsonProperty("origin_state_code")
    public String originStateCode;

    @JsonProperty("cd")
    public Date cd;

    @JsonProperty("ewbn")
    public List<Object> eWayBillNumber;

    @JsonProperty("rph")
    public String rph;

    @JsonProperty("shipment_length")
    public double shipmentLength;

    @JsonProperty("snm")
    public String snm;

    @JsonProperty("barcode")
    public String barcode;

    @JsonProperty("origin_city")
    public String originCity;

    @JsonProperty("weight")
    public double weight;

    @JsonProperty("pt")
    public String payment;

    @JsonProperty("rs")
    public double packageValue;

    @JsonProperty("destination")
    public String destination;

    @JsonProperty("si")
    public String si;

    @JsonProperty("destination_city")
    public String destinationCity;

    @JsonProperty("hsn_code")
    public String hsnCode;

    @JsonProperty("tin")
    public String tin;

    @JsonProperty("contact")
    public String contact;

    @JsonProperty("origin_state")
    public String originState;

    @JsonProperty("oid_barcode")
    public String orderIdBarcode;

    @JsonProperty("sid")
    public String sid;

    @JsonProperty("cst")
    public String cst;

    @JsonProperty("prd")
    public String prd;

    @JsonProperty("rcty")
    public String returnCity;

    @JsonProperty("consignee_gst_tin")
    public Object consigneeGstTin;

    @JsonProperty("cnph")
    public String cnph;

    @JsonProperty("sadd")
    public String senderAddress;

    @JsonProperty("oid")
    public String orderId;

    @JsonProperty("customer_state")
    public String customerState;

    @JsonProperty("mot")
    public String mot;

    @JsonProperty("radd")
    public String returnAddress;

    @JsonProperty("customer_state_code")
    public Object customerStateCode;

    @JsonProperty("address")
    public String address;

    @JsonProperty("rst")
    public String returnState;

    @JsonProperty("seller_gst_tin")
    public String sellerGstTin;

    @JsonProperty("shipment_height")
    public double shipmentHeight;

    @JsonProperty("pdd")
    public Object pdd;

    @JsonProperty("product_type")
    public String productType;

    @JsonProperty("name")
    public String name;

    @JsonProperty("st_code")
    public String stateCode;

    @JsonProperty("cl_logo")
    public String clientLogo;

    @JsonProperty("st")
    public String state;

    @JsonProperty("client_gst_tin")
    public String clientGstTin;

    @JsonProperty("etc")
    public String etc;

    @JsonProperty("delhivery_logo")
    public String delhiveryLogo;

    @JsonProperty("client_type")
    public String clientType;

    @JsonProperty("cod")
    public double cod;

    @JsonProperty("wbn")
    public String wayBillNumber;

    @JsonProperty("sort_code")
    public String sortCode;

    @JsonProperty("rpin")
    public int returnPincode;  
}
