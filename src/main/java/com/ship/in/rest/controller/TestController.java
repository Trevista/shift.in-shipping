package com.ship.in.rest.controller;

import com.ship.in.rest.feignclients.Dotzot.DotzotClient;
import com.ship.in.rest.feignclients.Dotzot.DotzotCreatOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    DotzotClient dotzotClient;

    @RequestMapping("/")
    public String index() {
        return "Shipping Application is up!";
    }

    // https://delhivery-express-api-doc.readme.io/reference#testinput-7


    @PostMapping(value = "/dotzot_trackorder")
    public Object trackorderDotzot(@RequestBody Object docketNo) {
        return dotzotClient.getOrderTrackingData(docketNo);
    }

    @PostMapping(value = "/dotzot_createorder")
    public Object createDotzotOrder(@RequestBody DotzotCreatOrder orderData) {
        return dotzotClient.createOrder(orderData);
    }


}