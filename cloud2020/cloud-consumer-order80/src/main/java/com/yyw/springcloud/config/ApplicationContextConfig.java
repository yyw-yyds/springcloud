package com.yyw.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author : yyw
 * @Date : 2021/8/7 17:38
 * @Version 1.0
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate  getRestTemplate(){
        return  new RestTemplate();
    }
}
