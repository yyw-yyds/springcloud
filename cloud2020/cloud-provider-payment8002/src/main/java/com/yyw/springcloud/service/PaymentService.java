package com.yyw.springcloud.service;

import com.yyw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author : yyw
 * @Date : 2021/8/6 23:08
 * @Version 1.0
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
