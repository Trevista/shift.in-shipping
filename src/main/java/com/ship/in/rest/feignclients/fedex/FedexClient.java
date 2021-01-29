package com.ship.in.rest.feignclients.fedex;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "fedex",url = "${baseurls.fedex:https://fedexyettoupdate}", configuration = FedexClientConfig.class)
public interface FedexClient {
    @GetMapping("/fedex-details nt recieved")
    public void getServicability(@RequestParam("filter_codes") String pincode);
}
