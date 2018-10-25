package com.config;

import com.enums.ResultEnum;
import com.exception.CommonException;
import com.exception.HomeinnsException;
import com.util.ResultUtils;
import com.util.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：linma
 * @date: 2018/10/25 18:37
 * @email:linma@homeinn.com
 **/
@ControllerAdvice
@RestController
public class GlobalException {

    /**
     * 统一捕获异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = RuntimeException.class)
    public ResultVO exceptionHandle(RuntimeException e) {
        if (e instanceof HomeinnsException) {
            HomeinnsException homeinnsException = (HomeinnsException) e;
            return ResultUtils.failure(homeinnsException);
        }
        return ResultUtils.failure(new CommonException(ResultEnum.NOT_KNOW_EXCEPTION));
    }
}
