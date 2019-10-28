package org.hzg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzgal on 2019-10-28.
 */
@RestController
public class UserController {

    @GetMapping("/user/home")
    public String home() {
        return "this is homepage";
    }
}
