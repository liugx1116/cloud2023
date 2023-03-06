package com.atgx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liugx
 * @Description TODO
 * @date 2023/3/5 15:31
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
