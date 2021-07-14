package com.cykj.springtest1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author: William
 * @date: 2021/7/12 19:44
 * @desc:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring";
    }
}
