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
public class DelhiveryShipmentResponse {

    @JsonProperty("Origin") 
    public String origin;

    @JsonProperty("Status") 
    public DelhiveryStatus status;

    @JsonProperty("PickUpDate") 
    public Date pickUpDate;

    @JsonProperty("ChargedWeight") 
    public Object chargedWeight;

    @JsonProperty("OrderType") 
    public String orderType;

    @JsonProperty("Destination") 
    public String destination;

    @JsonProperty("Consignee") 
    public Consignee consignee;

    @JsonProperty("ReferenceNo") 
    public String referenceNo;

    @JsonProperty("ReturnedDate") 
    public Object returnedDate;

    @JsonProperty("DestRecieveDate") 
    public Object destRecieveDate;

    @JsonProperty("OriginRecieveDate") 
    public Object originRecieveDate;

    @JsonProperty("OutDestinationDate") 
    public Object outDestinationDate;

    @JsonProperty("CODAmount") 
    public int codAmount;

    @JsonProperty("FirstAttemptDate") 
    public Object firstAttemptDate;

    @JsonProperty("ReverseInTransit") 
    public boolean reverseInTransit;

    @JsonProperty("Scans") 
    public List<Scan> scans;

    @JsonProperty("SenderName") 
    public String senderName;

    @JsonProperty("AWB") 
    public String aWB;

    @JsonProperty("DispatchCount") 
    public int dispatchCount;
    
    @JsonProperty("InvoiceAmount") 
    public int invoiceAmount;
}
