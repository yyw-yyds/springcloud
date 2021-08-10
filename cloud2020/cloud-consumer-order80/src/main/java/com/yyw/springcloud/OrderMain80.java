package com.yyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author : yyw
 * @Date : 2021/8/7 17:25
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

    public static void main(String[] args) {
            SpringApplication.run(OrderMain80.class, args);
        }
}
