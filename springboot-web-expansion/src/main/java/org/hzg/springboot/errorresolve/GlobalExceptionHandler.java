package org.hzg.springboot.errorresolve;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hzgal on 2019-10-28.
 * 全局处理异常类，可以统一处理Exception，也可以针对不同的异常做个性化的处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public String errorHandler(Exception e){
        return "global error " + e.getClass().getName();
    }
}
