package com.ship.in.rest.feignclients.delhivery;

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
public class Shipment {
    @JsonProperty("Origin")
    public String origin;

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Status {

        @JsonProperty("Error")
        public String error;

        @JsonProperty("Status")
        public String status;

        @JsonProperty("StatusLocation")
        public String statusLocation;

        @JsonProperty("StatusDateTime")
        public String statusDateTime;

        @JsonProperty("RecievedBy")
        public String recievedBy;

        @JsonProperty("Instructions")
        public String instructions;

        @JsonProperty("StatusType")
        public String statusType;
    }

    @JsonProperty("PickUpDate")
    public String pickUpDate;

    @JsonProperty("ChargedWeight")
    public int chargedWeight;

    @JsonProperty("OrderType")
    public String orderType;

    @JsonProperty("Destination")
    public String destination;

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Consignee {
        @JsonProperty("City")
        public String city;

        @JsonProperty("Name")
        public String name;

        @JsonProperty("Country")
        public String country;

        @JsonProperty("Address1")
        public String[] address1;

        @JsonProperty("Address2")
        public String[] address2;

        @JsonProperty("Address3")
        public String[] address3;

        @JsonProperty("PinCode")
        public int pinCode;

        @JsonProperty("State")
        public String state;

        @JsonProperty("Telephone1")
        public String[] telephone1;

        @JsonProperty("Telephone2")
        public String[] telephone2;
    }

    @JsonProperty("ReferenceNo")
    public String referenceNo;

    @JsonProperty("ReturnedDate")
    public String returnedDate;

    @JsonProperty("DestRecieveDate")
    public String destRecieveDate;

    @JsonProperty("OriginRecieveDate")
    public String originRecieveDate;

    @JsonProperty("OutDestinationDate")
    public String outDestinationDate;

    @JsonProperty("CODAmount")
    public String CODAmount;

    @JsonProperty("EWBN")
    public String EWBN;

    @JsonProperty("FirstAttemptDate")
    public String firstAttemptDate;

    @JsonProperty("ReverseInTransit")
    public boolean reverseInTransit;

    @JsonProperty("Scans")
    public List<ScanDetail> scans;

    @JsonProperty("SenderName")
    public String senderName;
    @JsonProperty("AWB")
    public String awb;

    @JsonProperty("DispatchCount")
    public int dispatchCount;

    @JsonProperty("InvoiceAmount")
    public int invoiceAmount;
}

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
class ScanDetail {
    @JsonProperty("ScanDateTime")
    public String scanDateTime;

    @JsonProperty("ScanType")
    public String scanType;

    @JsonProperty("Scan")
    public String scan;
    @JsonProperty("StatusDateTime")
    public String statusDateTime;

    @JsonProperty("ScannedLocation")
    public String scannedLocation;

    @JsonProperty("Instructions")
    public String instructions;

    @JsonProperty("StatusCode")
    public String statusCode;
}
