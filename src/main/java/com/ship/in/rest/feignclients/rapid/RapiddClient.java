package com.ship.in.rest.feignclients.rapid;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import feign.Headers;

@FeignClient(value = "rapid", url = "${services.rapid.url:http://trace.rapiddelivery.co}", configuration = RapidClientConfig.class)
public interface RapiddClient {
    
    @GetMapping(value = "/api/pincode.php",  consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    // @Headers("Content-Type: text/html;charset=UTF-8")
    Object getServicability(@RequestParam("pincode") String pincode);

    @PostMapping(value = "/api/v2/createpackage.php", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public CreateOrderResponse createOrder(@RequestBody Map<String, ?> createOrder);

    @GetMapping("/api/track.php")
    public TrackResponse getPackageStatus(@RequestParam("client") String client,
    @RequestParam("token") String token, @RequestParam("waybill") String waybill);
    
    @PostMapping(value = "/api/pickup.php", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @Headers("Content-Type: application/json;charset=UTF-8")
    public PickupResponse createPickup(@RequestBody Map<String, ?> pickupRequest);
}
