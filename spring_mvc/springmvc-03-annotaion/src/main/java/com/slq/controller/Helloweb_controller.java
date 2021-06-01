package com.slq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-06-15:06
 */
@Controller
//@RequestMapping("/allweb")  //设置多级访问地址：xx/allweb/web1
public class Helloweb_controller {
    //url如何获得controller
    @RequestMapping("/web1")  //前端访问页面的地址
    public String test01(Model model){
        /*
        封装参数，向模型中添加属性msg的值，可以在jsp页面取出并渲染
         */
        model.addAttribute("msg","原来你在这呀~");
        /*
        返回的字符串会被 视图解析器捕获、处理
         */
        return "mainweb";  //返回真正的jsp文件名
    }

    @RequestMapping("/web2")  //前端访问页面的地址
    public String test02(Model model){
        /*
        封装参数，向模型中添加属性msg的值，可以在jsp页面取出并渲染
         */
        model.addAttribute("msg","我一直在这呀！");
        /*
        返回的字符串会被 视图解析器捕获、处理
         */
        return "mainweb";  //返回真正的jsp文件名
    }

}
