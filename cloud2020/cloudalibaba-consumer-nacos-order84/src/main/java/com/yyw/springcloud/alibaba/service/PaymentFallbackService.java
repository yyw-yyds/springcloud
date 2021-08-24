package com.yyw.springcloud.alibaba.service;

import com.yyw.springcloud.entities.CommonResult;
import com.yyw.springcloud.entities.Payment;
import org.springframework.stereotype.Component;


@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<Payment>(444,"服务降级返回---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
