package com.atgx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liugx
 * @Description TODO
 * @date 2023/3/5 15:32
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonResult <T>{
    private Integer code;
    private String message;
    private T data;
    public CommonResult(String code ,String message){
        this(Integer.valueOf(code),message,null);
    }
}
