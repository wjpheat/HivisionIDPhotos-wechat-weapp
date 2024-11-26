package org.zjzWx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.zjzWx.util.R;

/**
 * @author w
 * @date 2024/11/22 12:56
 */
@Controller
public class Test {


    @GetMapping("/test")
    public R checkLogin(String code) {
        System.out.println("11111111111111111111111111");
        return R.ok("dasda");
    }
}
