package com.exception;

import com.enums.ProductEnum;

/**
 * @author：linma
 * @date: 2018/10/25 9:56
 * @email:linma@homeinn.com
 **/
public class ProductException extends HomeinnsException {

    public ProductException(Integer code, String message) {
        super(code, message);
    }

    public ProductException(ProductEnum productEnum) {
        this(productEnum.getCode(), productEnum.getMessage());
    }
}
