package com.ship.in.rest.services;

import java.util.Map;

import com.ship.in.rest.feignclients.rapid.CreateOrderResponse;
import com.ship.in.rest.feignclients.rapid.PickupOrderRequest;
import com.ship.in.rest.feignclients.rapid.CreateOrderRequest;
import com.ship.in.rest.feignclients.rapid.PickupResponse;
import com.ship.in.rest.feignclients.rapid.ServiceabilityResponse;
import com.ship.in.rest.feignclients.rapid.TrackResponse;

public interface RapidService {

    ServiceabilityResponse getServiceability(String pincode);

    CreateOrderResponse createOrder(CreateOrderRequest createOrder);

    TrackResponse getPackageStatus(String waybill);

    PickupResponse createPickup(PickupOrderRequest pickupRequest);

}
