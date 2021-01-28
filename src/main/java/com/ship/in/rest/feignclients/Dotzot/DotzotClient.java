package com.ship.in.rest.feignclients.Dotzot;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "dotzot", url = "${services.dotzot.url:https://instacom-staging.azurewebsites.net}", configuration = DotzotClientConfig.class)
@RequestMapping("RestService")
public interface DotzotClient {

    @PostMapping(value = "DocketTrackingService.svc/GetDocketTrackingDetails")
    public List<DotzotTrackOrder> getOrderTrackingData(@RequestBody Object docketNo);

    @PostMapping(value = "pushorderdataservice.svc/pushorderdata_pudo_gst")
    public List<DotzotCreateOrderResult> createOrder(@RequestBody DotzotCreatOrder orderData);

}
