package com.yyw.springcloud.dao;

import com.yyw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author : yyw
 * @Date : 2021/8/5 23:13
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {

    public int creat(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
