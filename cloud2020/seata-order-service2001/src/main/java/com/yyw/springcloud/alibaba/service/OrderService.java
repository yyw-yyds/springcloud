package com.yyw.springcloud.alibaba.service;

import com.yyw.springcloud.alibaba.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}

