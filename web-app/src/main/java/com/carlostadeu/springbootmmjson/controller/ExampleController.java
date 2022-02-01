package com.carlostadeu.springbootmmjson.controller;

import com.carlostadeu.springbootmmjson.model.ShippingAdress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAdress getShippingAddress() {
        return new ShippingAdress();
    }
}
