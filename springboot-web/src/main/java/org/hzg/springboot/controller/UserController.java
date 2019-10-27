package org.hzg.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by hzgal on 2019-10-23.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/test",method = RequestMethod.POST)
    @ResponseBody
    public String testUser() {
        return "user home page";
    }

    @GetMapping("/user/test/getMapping")    //相当于定义请求方式只能为get
    @ResponseBody
    public String getMappingTest() {
        return "getMapping";
    }

    @PostMapping("/test/requestParam")  //利用@RequestParam默认参数为必填项，若想设置成非必填,需要写成这种形式@RequestParam(value = "password", required = false)
    @ResponseBody
    public String requestParamTest(@RequestParam(value = "userName",defaultValue = "admin") String userName, @RequestParam(value = "password", required = false) String password) {
        return "传参成功：userName=" + userName + ",password=" + password;
    }

    @PostMapping("/test/pathVariabe/{id}")    //@PathVariable 表示从请求url中获取参数，写法如左边所示
    @ResponseBody
    public String pathVariabeTest(@PathVariable("id") String id) {
        return "获取到了id值：id=" + id;
    }

    @PostMapping("/test/getRequestServlet")
    @ResponseBody
    public String pathVariabeTest(HttpServletRequest request) {
        return request.getAuthType();
    }
}
