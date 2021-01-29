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
public class CreateOrder {

    @JsonProperty("pickup_location")
    public PickupLocation pickupLocation;

    @JsonProperty("shipments")
    public List<Shipments> shipments;
}

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
class PickupLocation {

    @JsonProperty("pin")
    public String pin;

    @JsonProperty("add")
    public String add;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("state")
    public String state;

    @JsonProperty("city")
    public String city;

    @JsonProperty("country")
    public String country;

    @JsonProperty("name")
    public String name;
}

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
class Shipments {

    @JsonProperty("return_name")
    public String returnName;

    @JsonProperty("return_pin")
    public String returnPin;

    @JsonProperty("return_city")
    public String returnCity;

    @JsonProperty("return_phone")
    public String returnPhone;

    @JsonProperty("return_add")
    public String returnAdd;

    @JsonProperty("return_state")
    public String returnState;

    @JsonProperty("return_country")
    public String returnCountry;

    @JsonProperty("order")
    public String order;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("products_desc")
    public String productsDesc;

    @JsonProperty("cod_amount")
    public String codAmount;

    @JsonProperty("name")
    public String name;

    @JsonProperty("country")
    public String country;

    @JsonProperty("seller_inv_date")
    public String sellerInvDate;

    @JsonProperty("order_date")
    public String orderDate;

    @JsonProperty("total_amount")
    public String totalAmount;

    @JsonProperty("seller_add")
    public String sellerAdd;

    @JsonProperty("seller_cst")
    public String sellerCst;

    @JsonProperty("add")
    public String add;

    @JsonProperty("seller_name")
    public String sellerName;

    @JsonProperty("seller_inv")
    public String sellerInv;

    @JsonProperty("seller_tin")
    public String sellerTin;

    @JsonProperty("pin")
    public String pin;

    @JsonProperty("quantity")
    public String quantity;

    @JsonProperty("payment_mode")
    public String paymentMode;

    @JsonProperty("state")
    public String state;

    @JsonProperty("city")
    public String city;

    @JsonProperty("client")
    public String client;
}
