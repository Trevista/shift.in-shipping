package com.ship.in.rest.feignclients.Dotzot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DotzotCreatOrder {

    @JsonProperty("Customer")
    public Customer customer;

    @JsonProperty("DocketList")
    public List<Docket> docketList;

}


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
class Customer {

    @JsonProperty("CUSTCD")
    public String custcd;

}

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
class Docket {

    @JsonProperty("AgentID")
    public String agentId;

    @JsonProperty("AwbNo")
    public String awbNo;

    @JsonProperty("Breath")
    public String breath;

    @JsonProperty("CPD")
    public String cpd;

    @JsonProperty("CollectableAmount")
    public String collectableAmount;

    @JsonProperty("Consg_Number")
    public String consgNumber;

    @JsonProperty("Consolidate_EW")
    public String consolidateEw;

    @JsonProperty("CustomerName")
    public String customerName;

    @JsonProperty("Ewb_Number")
    public String ewbNumber;

    @JsonProperty("GST_REG_STATUS")
    public String gstRegStatus;

    @JsonProperty("HSN_code")
    public String hsnCode;

    @JsonProperty("Height")
    public String height;

    @JsonProperty("Invoice_Ref")
    public String invoiceRef;

    @JsonProperty("IsPudo")
    public String isPudo;

    @JsonProperty("ItemName")
    public String itemName;

    @JsonProperty("Length")
    public String length;

    @JsonProperty("Mode")
    public String mode;

    @JsonProperty("NoOfPieces")
    public String noOfPieces;

    @JsonProperty("OrderConformation")
    public String orderConformation;

    @JsonProperty("OrderNo")
    public String orderNo;

    @JsonProperty("ProductCode")
    public String productCode;

    @JsonProperty("PudoId")
    public String pudoId;

    @JsonProperty("REASON_TRANSPORT")
    public String reasonTransport;

    @JsonProperty("RateCalculation")
    public String rateCalculation;

    @JsonProperty("Seller_GSTIN")
    public String sellerGSTIN;

    @JsonProperty("ShippingAdd1")
    public String shippingAdd1;

    @JsonProperty("ShippingAdd2")
    public String shippingAdd2;

    @JsonProperty("ShippingCity")
    public String shippingCity;

    @JsonProperty("ShippingEmailId")
    public String shippingEmailId;

    @JsonProperty("ShippingMobileNo")
    public String shippingMobileNo;

    @JsonProperty("ShippingState")
    public String shippingState;

    @JsonProperty("ShippingTelephoneNo")
    public String shippingTelephoneNo;

    @JsonProperty("ShippingZip")
    public String shippingZip;

    @JsonProperty("Shipping_GSTIN")
    public String shippingGSTIN;

    @JsonProperty("TotalAmount")
    public String totalAmount;

    @JsonProperty("TransDistance")
    public String transDistance;

    @JsonProperty("TransporterID")
    public String transporterID;

    @JsonProperty("TransporterName")
    public String transporterName;

    @JsonProperty("TypeOfDelivery")
    public String typeOfDelivery;

    @JsonProperty("TypeOfService")
    public String typeOfService;

    @JsonProperty("UOM")
    public String uom;

    @JsonProperty("VendorAddress1")
    public String vendorAddress1;

    @JsonProperty("VendorAddress2")
    public String vendorAddress2;

    @JsonProperty("VendorName")
    public String vendorName;

    @JsonProperty("VendorPincode")
    public String vendorPincode;

    @JsonProperty("VendorTeleNo")
    public String vendorTeleNo;

    @JsonProperty("Weight")
    public String weight;
}


