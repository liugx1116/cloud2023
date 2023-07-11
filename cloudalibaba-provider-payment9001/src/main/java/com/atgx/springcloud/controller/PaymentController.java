package com.atgx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: liugx
 * @CreateTime: 2023-07-11  08:57
 * @Description: TODO
 * @Version: 1.0
 */
public class PaymentController {

    @Value("{server.port}")
    private String serverPort;

    @GetMapping(value = "payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }
}
