package com.util;

import lombok.Data;

/**
 * @author：linma
 * @date: 2018/10/24 15:05
 * @email:linma@homeinn.com
 **/
@Data
public class ResultVO<T> {

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 请求之后，返回信息
     */
    private String message;

    /**
     * 请求之后，返回数据
     */
    private T data;
}
