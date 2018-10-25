package com.exception;

import com.enums.ResultEnum;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/10/24 15:24
 * @email:linma@homeinn.com
 **/
@Getter
public class ResultException extends HomeinnsException {

    public ResultException(Integer code, String message) {
        super(code, message);
    }

    public ResultException(ResultEnum resultEnum) {
        this(resultEnum.getCode(), resultEnum.getMessage());
    }

}
