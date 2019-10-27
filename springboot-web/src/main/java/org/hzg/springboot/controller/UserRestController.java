package org.hzg.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzgal on 2019-10-23.
 */
@RestController   //RestController = controller + responsebody
public class UserRestController {

    @PostMapping("/test/restController")
    public String testRestController() {
        return "==============>>>>>>>>>>>>>>>>>>>>>>>";
    }
}
