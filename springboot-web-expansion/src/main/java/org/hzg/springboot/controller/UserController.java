package org.hzg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzgal on 2019-10-27.
 */
@RestController
public class UserController {

    @GetMapping("/user/show")
    public String show() {
        return "this is user controller.";
    }

    @GetMapping("/user/help")
    public String help() {
        throw new IllegalArgumentException("args is null");
    }

    @GetMapping("/user/nullpointer")
    public String nullpointer() {
        throw new NullPointerException("空指针异常");
    }
}
