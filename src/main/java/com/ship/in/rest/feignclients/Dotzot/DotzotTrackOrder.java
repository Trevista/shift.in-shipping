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
public class DotzotTrackOrder {

    @JsonProperty("IsSuccess")
    public boolean isSuccess;

    @JsonProperty("Message")
    public String message;

    @JsonProperty("DOCKNO")
    public String dockNo;

    @JsonProperty("ORDER_NO")
    public String orderNo;

    @JsonProperty("RECIEVER_NAME")
    public String recieverName;

    @JsonProperty("CONTACT_NO")
    public String contactNo;

    @JsonProperty("PINCODE")
    public String pincode;

    @JsonProperty("ORIGIN")
    public String origin;

    @JsonProperty("DESTINATION")
    public String destination;

    @JsonProperty("NO_OF_PIECES")
    public String noOfPieces;

    @JsonProperty("WEIGHT")
    public String weight;

    @JsonProperty("CHARGED_WEIGHT")
    public String chargedWeight;

    @JsonProperty("PRODUCT")
    public String product;

    @JsonProperty("VALUE_OF_SHIPMENT")
    public String valueOfShipment;

    @JsonProperty("COD_AMOUNT")
    public String codAmount;

    @JsonProperty("SERVICE_TYPE")
    public String serviceType;

    @JsonProperty("CURRENT_CITY")
    public String currentCity;

    @JsonProperty("CURRENT_STATUS")
    public String currentStatus;

    @JsonProperty("EVENTDATE")
    public String eventDate;

    @JsonProperty("EVENTTIME")
    public String eventTime;

    @JsonProperty("NEXT_LOCATION")
    public String nextLocation;

    @JsonProperty("TRACKING_CODE")
    public String trackingCode;

    @JsonProperty("Detail")
    public List<Detail> detail;
}

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
class Detail {
    
    @JsonProperty("CURRENT_CITY")
    public String currentCity;

    @JsonProperty("CURRENT_STATUS")
    public String currentStatus;

    @JsonProperty("EVENTDATE")
    public String eventDate;

    @JsonProperty("EVENTTIME")
    public String eventTime;

    @JsonProperty("NEXT_LOCATION")
    public String nextLocation;

    @JsonProperty("TRACKING_CODE")
    public String trackingCode;
    
}
