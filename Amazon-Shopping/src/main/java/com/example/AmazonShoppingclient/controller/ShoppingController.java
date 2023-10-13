package com.example.AmazonShoppingclient.controller;


import com.example.AmazonShoppingclient.feignProxcy.PaymentServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    @Autowired
    private PaymentServiceClient paymentServiceClient;

    @GetMapping("/invokeAmazonPaymentService/{price}")
    public String invokePaymentService(@PathVariable int price){
        return paymentServiceClient.payNow(price);
    }
}
