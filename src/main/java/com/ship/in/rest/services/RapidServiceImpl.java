package com.ship.in.rest.services;

import java.util.Map;

import javax.transaction.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ship.in.rest.feignclients.rapid.CreateOrderResponse;
import com.ship.in.rest.feignclients.rapid.PickupOrderRequest;
import com.ship.in.rest.feignclients.rapid.CreateOrderRequest;
import com.ship.in.rest.feignclients.rapid.PickupResponse;
import com.ship.in.rest.feignclients.rapid.RapiddClient;
import com.ship.in.rest.feignclients.rapid.ServiceabilityResponse;
import com.ship.in.rest.feignclients.rapid.TrackResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RapidServiceImpl implements RapidService {

    @Autowired
    RapiddClient rapidClient;

    @Autowired
    ObjectMapper mapper;

    @Value("${services.rapid.client}")
    String client;

    @Value("${services.rapid.token}")
    String token;

    @Transactional
    public ServiceabilityResponse getServiceability(String pincode) {
       return mapper.convertValue(rapidClient.getServicability(pincode), ServiceabilityResponse.class) ;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public CreateOrderResponse createOrder(CreateOrderRequest createOrder) {
        createOrder.client = this.client;
        createOrder.token = this.token;
        Map<String,?> orderRequest = mapper.convertValue(createOrder, Map.class);
        return mapper.convertValue(rapidClient.createOrder(orderRequest), CreateOrderResponse.class) ;
    }

    @Transactional
    public TrackResponse getPackageStatus(String waybill) {
        return mapper.convertValue(rapidClient.getPackageStatus(client, token, waybill), TrackResponse.class) ;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public PickupResponse createPickup(PickupOrderRequest pickupRequest) {
        pickupRequest.client = this.client;
        pickupRequest.token = this.token;
        Map<String,?> orderRequest = mapper.convertValue(pickupRequest, Map.class);
        return mapper.convertValue(rapidClient.createPickup(orderRequest), PickupResponse.class) ;
    }
    
}
