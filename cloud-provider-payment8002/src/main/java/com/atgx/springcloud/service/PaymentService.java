package com.atgx.springcloud.service;

import com.atgx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author liugx
 * @Description TODO
 * @date 2023/3/5 15:50
 **/
public interface PaymentService {
    public int create(Payment payment);
//
    public Payment getPaymentById(@Param("id") Long id);
}
