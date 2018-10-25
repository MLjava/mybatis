package com.exception;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/10/24 14:37
 * @email:linma@homeinn.com
 **/
@Getter
public class HomeinnsException extends RuntimeException {

    private Integer code;

    public HomeinnsException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
