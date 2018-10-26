package com.exception;

import com.enums.ProductEnum;
import com.enums.ResultEnum;

/**
 * @author：linma
 * @date: 2018/10/24 17:40
 * @email: linma@homeinns.com
 **/
public class CommonException extends HomeinnsException {

    public CommonException(Integer code, String message) {
        super(code, message);
    }

    public CommonException(ResultEnum productEnum) {
        this(productEnum.getCode(), productEnum.getMessage());
    }
}
