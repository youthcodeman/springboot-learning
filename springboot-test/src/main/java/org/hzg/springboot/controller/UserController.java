package org.hzg.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzgal on 2019-11-5.
 */
@RestController
public class UserController {

    @PostMapping("/user/home")
    public String userHome() {
        System.out.println("/user/home url is invoke");
        return "user home";
    }

    @PostMapping("/user/show")
    public String userShow(@RequestParam Integer id) {
        System.out.println("/user/show url is invoke");
        return "user show" + id;
    }
}
