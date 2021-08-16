package com.yyw.spring.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){

        return "线程池：  "+Thread.currentThread().getName()+"paymentInfo_OK ,id: " +id+"\t"+"哈哈哈";
    }


    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler")
    public String paymentInfo_TimeOut(Integer id){

        int timeNumber = 5;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池：  "+Thread.currentThread().getName()+"paymentInfo_TimeOut ,id: " +id+"\t"+"哈哈哈" +" 耗时(秒):" +timeNumber;
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池：  "+Thread.currentThread().getName()+"paymentInfo_TimeOutHandler ,id: " +id+"\t"+"哭了" ;

    }


    }
