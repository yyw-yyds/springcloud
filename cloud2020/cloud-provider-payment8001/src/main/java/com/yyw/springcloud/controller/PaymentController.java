package com.yyw.springcloud.controller;

import com.yyw.springcloud.entities.CommonResult;
import com.yyw.springcloud.entities.Payment;
import com.yyw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author : yyw
 * @Date : 2021/8/6 23:22
 * @Version 1.0
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){

        int result = paymentService.creat( payment);
        log.info("*****插入结果：" + result);

        if(result>0){
            return new CommonResult(200,"插入数据成功",result);
        }else {
            return  new CommonResult(444,"插入数据失败",null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果：" + payment);

        if(payment!= null ){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return  new CommonResult(444,"没有对应记录，查询ID"+id ,null);
        }

    }
}
