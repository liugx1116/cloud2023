package com.atgx.springcloud.service;

import com.atgx.springcloud.entities.CommonResult;
import com.atgx.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") long id);


    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeOut();
}
