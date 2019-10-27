package org.hzg.springboot.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hzgal on 2019-10-23.
 */
@Controller
public class ViewController {

    @GetMapping("/user/login")  //利用@RequestParam默认参数为必填项，若想设置成非必填,需要写成这种形式@RequestParam(value = "password", required = false)
    public String userLogin(@RequestParam(value = "userName",defaultValue = "admin") String userName, @RequestParam(value = "password", required = false) String password) {
        if("admin".equals(userName) && "123456".equals(password)) {
            return "success";
        }else {
            return "failure";
        }
    }
}
