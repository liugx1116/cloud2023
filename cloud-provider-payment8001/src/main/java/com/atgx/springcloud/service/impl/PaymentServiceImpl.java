package com.atgx.springcloud.service.impl;

import com.atgx.springcloud.dao.PaymentDao;
import com.atgx.springcloud.entities.Payment;
import com.atgx.springcloud.service.PaymentService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author liugx
 * @Description TODO
 * @date 2023/3/5 15:51
 **/
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
