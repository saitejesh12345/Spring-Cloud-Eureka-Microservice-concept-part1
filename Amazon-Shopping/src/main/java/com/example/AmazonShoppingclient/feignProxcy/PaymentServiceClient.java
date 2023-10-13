package com.example.AmazonShoppingclient.feignProxcy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "payment-service",url ="http://localhost:8888")
public interface PaymentServiceClient {

    @GetMapping("/payment/payNow/{price}")
    String payNow(@PathVariable("price") int price);
}
