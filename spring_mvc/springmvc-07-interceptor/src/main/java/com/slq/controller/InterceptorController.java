package com.slq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-25-17:30
 */
@RestController
//RestController不会跳转到jsp页面，直接将return值输出到网页上
public class InterceptorController {
    @RequestMapping("/t")
    public String test(){
        return "hello";
    }
}
