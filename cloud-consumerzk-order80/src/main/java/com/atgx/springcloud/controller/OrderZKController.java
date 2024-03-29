package com.atgx.springcloud.controller;

import org.apache.zookeeper.server.admin.JsonOutputter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author liugx
 * @Description TODO
 * @date 2023/3/15 19:50
 **/
@RestController
public class OrderZKController {
    public static final String INVOKE_URL = "http://cloud-provider-payment" ;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }
}
