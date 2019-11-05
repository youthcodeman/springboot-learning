package org.hzg.springboot.controller;

import org.hzg.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzgal on 2019-11-5.
 */
@RestController
public class UserController2 {
    @Autowired
    private UserDao userDao;

    @PostMapping("/user/home/2")
    public String userHome() {
        System.out.println("/user/home2 url is invoke");
        userDao.addUser("zhangsan");
        return "user home";
    }

    @PostMapping("/user/show/2")
    public String userShow(@RequestParam Integer id) {
        System.out.println("/user/show2 url is invoke");
        userDao.addUser("lisi");
        return "user show" + id;
    }
}
