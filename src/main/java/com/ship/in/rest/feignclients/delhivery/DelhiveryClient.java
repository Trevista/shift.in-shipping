package com.ship.in.rest.feignclients.delhivery;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@FeignClient(value = "delhivery", url = "${services.delhivery.url:https://track.delhivery.com}", configuration = DelhiveryClientConfig.class)
public interface DelhiveryClient {
    @GetMapping("/c/api/pin-codes/json/?parameter")
    public DelhiveryCodesResponse getServicability(@RequestParam("filter_codes") String pincode);// Unused

    @GetMapping("/api/kinko/v1/invoice/charges/.json")
    public List<DeliveryCost> getCost(@RequestParam("ss") String ss, @RequestParam("md") String md, @RequestParam("pt") String pt, @RequestParam("cgm") Integer cgm, @RequestParam("d_pin") String destPin, @RequestParam("o_pin") String originPin);

    @GetMapping("/api/v1/packages/json/")
    public DelihiveryTrackResponse getOrderTrackingData(@RequestParam("waybill") String waybill);

    @GetMapping("/api/p/packing_slip")
    public PackageSlipResponse getpackingSlip(@RequestParam("wbns") String wbns);

    @PostMapping(value = "/api/cmu/create.json?format=json", consumes = MediaType.ALL_VALUE)
    public CreateOrderResponse createOrder(@RequestBody String data);

    @PostMapping(value = "/api/p/edit")
    public EditResponse updateOrder(@RequestBody EditOrderRequest data);
}
