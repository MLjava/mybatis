package com.exception;

import com.enums.CommonEnum;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/10/24 14:37
 * @email: linma@homeinns.com
 **/
@Getter
public class HomeinnsException extends RuntimeException {

    private Integer code;

    public HomeinnsException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public HomeinnsException(CommonEnum commonEnum) {
        this(commonEnum.getCode(), commonEnum.getMessage());
    }

}
