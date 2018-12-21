package com.aop;

import com.enums.CommonEnum;
import com.exception.HomeinnsException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author：linma
 * @date: 2018/12/21 13:43
 * @email: linma@homeinns.com
 **/
@Aspect
@Component
@Slf4j
public class ServiceReturnAop {

    @Pointcut("execution(public * com.services.impl..*ServiceImpl.find*(..))")
    public void service() { }

    @AfterReturning(value = "service()", returning = "back")
    public void methodReturn(Object back) {
        log.info("===检查返回值====");
        if (back == null) {
            throw new HomeinnsException(CommonEnum.NOT_FOUND_DATA);
        }
        if (back instanceof List) {
            List<?> list = (List<?>) back;
            if (list.size() == 0) {
                throw new HomeinnsException(CommonEnum.NOT_FOUND_DATA);
            }
        }
        if (back instanceof Set) {
            Set<?> set = (Set<?>) back;
            if (set.size() == 0) {
                throw new HomeinnsException(CommonEnum.NOT_FOUND_DATA);
            }
        }
        if (back instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) back;
            if (map.isEmpty()) {
                throw new HomeinnsException(CommonEnum.NOT_FOUND_DATA);
            }
        }
    }

}
