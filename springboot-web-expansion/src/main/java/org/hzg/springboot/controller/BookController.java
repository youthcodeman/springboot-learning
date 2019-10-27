package org.hzg.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * Created by hzgal on 2019-10-28.
 */
@RestController
public class BookController {

    //另外一种异常处理机制，可以统一处理Exception，也可以针对不同的异常做个性化的处理
    //这样写只能处理当前类中的异常
    @ExceptionHandler(value=Exception.class)
    public String error(Exception e){
        return "found exception : " + e.getMessage();
    }

    @GetMapping("/book/error1")
    public String error1() throws FileNotFoundException {
        throw new FileNotFoundException("book.txt not found");
    }

    @GetMapping("/book/error2")
    public String error2() throws ClassNotFoundException {
        throw new ClassNotFoundException("Book class not found");
    }
}
