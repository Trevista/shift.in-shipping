package com.ship.in.rest.controller;

import com.ship.in.rest.feignclients.rapid.CreateOrderResponse;
import com.ship.in.rest.feignclients.rapid.PickupOrderRequest;
import com.ship.in.rest.feignclients.rapid.PickupResponse;
import com.ship.in.rest.feignclients.rapid.CreateOrderRequest;
import com.ship.in.rest.feignclients.rapid.ServiceabilityResponse;
import com.ship.in.rest.feignclients.rapid.TrackResponse;
import com.ship.in.rest.services.RapidService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RapidController {
    
    @Autowired
    RapidService rapidService;

    @GetMapping("rapid//service")
    public ServiceabilityResponse getServiceability(@RequestParam String pincode){
        return rapidService.getServiceability(pincode);
    }

    @PostMapping("rapid/package/manifest")
    public CreateOrderResponse createOrder(@RequestBody CreateOrderRequest createOrder){
        return rapidService.createOrder(createOrder);
    }

    @GetMapping("rapid/package/track")
    public TrackResponse getPackageStatus(@RequestParam String waybill){
        return rapidService.getPackageStatus(waybill);
    }

    @PostMapping(value = "rapid/package/pickup", produces =  MediaType.APPLICATION_JSON_VALUE)
    public PickupResponse createPickup(@RequestBody PickupOrderRequest pickupRequest){
        return rapidService.createPickup(pickupRequest);
    }
}
