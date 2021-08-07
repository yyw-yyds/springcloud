package com.yyw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : yyw
 * @Date : 2021/8/7 17:30
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;
    private String  message;
    private T       data;


    public  CommonResult(Integer code,String message){
        this(code,message,null);

    }
}
