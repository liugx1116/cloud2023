package com.atgx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: liugx
 * @CreateTime: 2023-03-21  08:42
 * @Description: feign启动类
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients // 开启使用
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
