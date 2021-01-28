package com.ship.in.rest.controller;

import java.io.IOException;
import java.util.List;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ship.in.rest.feignclients.delhivery.CreateDelhiveryOrder;
import com.ship.in.rest.feignclients.delhivery.DelhiveryClient;
import com.ship.in.rest.feignclients.delhivery.DeliveryCost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DelhiveryController {

    @Autowired
    DelhiveryClient delhiveryClient;

    @GetMapping("/delhiveryCost")
    public Object delhiverytest(@RequestParam String ss,
            @RequestParam(value = "cgm", required = false) Integer cgm, @RequestParam("d_pin") String destPin,
            @RequestParam("o_pin") String originPin) {
        List<DeliveryCost> delhiveryCosts = delhiveryClient.getCost(ss, "S", null, cgm, destPin, originPin);
        delhiveryCosts.forEach(x -> {
            x.deliveryType = "S";
        });
        List<DeliveryCost> expressDelhiveryCosts = delhiveryClient.getCost(ss, "E", null, cgm, destPin, originPin);
        expressDelhiveryCosts.forEach(x -> {
            x.deliveryType = "E";
        });
        delhiveryCosts.addAll(expressDelhiveryCosts);
        return delhiveryCosts;
    }

    @GetMapping(value="/delhiveryOrderTrack/{waybill}")
    public Object delhiveryOrderTrack(@PathVariable String waybill) {
        return delhiveryClient.getOrderTrackingData(waybill);
    }

    @GetMapping(value="/delhiverygetServicability")
    public Object delhiveryServiceCheck(@RequestParam(value = "filter_codes") String pincode) {
        return delhiveryClient.getServicability(pincode);
    }

    @GetMapping(value="/delhiveryPackingSlip")
    public Object delhiveryPackageSlip(@RequestParam String wbns) {
        return delhiveryClient.getpackingSlip(wbns);
    }

    @PostMapping("/createOrder")
    public Object createOrder(@RequestBody CreateDelhiveryOrder data) {
        ObjectMapper obj = new ObjectMapper();
        try {
            String jsonStr = "format=json&data=" +  obj.writeValueAsString(data);
            return delhiveryClient.createOrder(jsonStr);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
