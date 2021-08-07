package com.yyw.springcloud.service.impl;

import com.yyw.springcloud.dao.PaymentDao;
import com.yyw.springcloud.entities.Payment;
import com.yyw.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author : yyw
 * @Date : 2021/8/6 23:15
 * @Version 1.0
 */

@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int creat(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}


