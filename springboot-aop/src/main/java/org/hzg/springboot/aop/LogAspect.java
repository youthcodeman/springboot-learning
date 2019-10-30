package org.hzg.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by hzgal on 2019-10-30.
 */
@Component
@Aspect
public class LogAspect {

    @Before("execution(* org.hzg.springboot.dao..*.*(..))")
    public void preLog() {
        System.out.println("==========================方法开始=================================");
    }

    @After("execution(* org.hzg.springboot.dao..*.*(..))")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getTarget().getClass());
        System.out.println(Arrays.asList(joinPoint.getArgs()));
        System.out.println("==========================方法结束=================================");
    }
}
