package com.slq.controller;

import com.slq.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-08-16:24
 */
@Controller
@RequestMapping("/acp")
public class AcpController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        System.out.println("前端接收name：" + name); //接收前端参数
        model.addAttribute("msg", name);  //数据回显到前端
        return "mainweb";//视图跳转
    }

    @GetMapping("/t2")
    public String test2( User user, Model model){
        System.out.println("前端接收user：" + user);
        model.addAttribute("msg", user);  //数据回显到前端
        return "mainweb";
    }
}
