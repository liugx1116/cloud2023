package com.atgx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: liugx
 * @CreateTime: 2023-04-12  08:51
 * @Description: hystrix dashboard 仪表盘
 * @Version: 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard // 开启仪表盘
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
