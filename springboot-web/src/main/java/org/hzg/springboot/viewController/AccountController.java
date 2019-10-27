package org.hzg.springboot.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hzgal on 2019-10-24.
 */
@Controller
public class AccountController {

    @GetMapping("/reg")
    public String regist() {
        return "reg";
    }
}
