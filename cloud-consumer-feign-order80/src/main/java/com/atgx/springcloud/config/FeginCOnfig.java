package com.atgx.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liugx
 * @CreateTime: 2023-03-23  09:03
 * @Description: 设置openfeign日志
 * @Version: 1.0
 */
@Configuration
public class FeginCOnfig {
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
