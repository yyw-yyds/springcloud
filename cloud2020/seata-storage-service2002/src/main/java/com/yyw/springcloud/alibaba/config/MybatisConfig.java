package com.yyw.springcloud.alibaba.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yyw.springcloud.alibaba.dao")
public class MybatisConfig {
}
