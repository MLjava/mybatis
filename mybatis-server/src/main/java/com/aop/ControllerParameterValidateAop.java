package com.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author：linma
 * @date: 2018/10/26 16:18
 * @email: linma@homeinns.com
 **/
@Aspect
@Component
@Slf4j
public class ControllerParameterValidateAop {

//    @Pointcut("execution(public * com.controller..*.*(..))")
//    private void controller() {
//
//    }
//
//    @Before(value = "controller()")
//    public void methodBefore(ProceedingJoinPoint joinPoint) {
//        ServletRequestAttributes attributes = (ServletRequestAttributes)
//                RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        Object[] args = joinPoint.getArgs();
//        String str = String.valueOf(args);
//    }

}
