package com.atgx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @Author: liugx
 * @CreateTime: 2023-03-17  12:11
 * @Description: 替换默认轮询算法
 * @Version: 1.0
 */
public class MyselfRule {
    @Bean
    public IRule myrule(){
        // 随机
        return new RandomRule();
    }
}
