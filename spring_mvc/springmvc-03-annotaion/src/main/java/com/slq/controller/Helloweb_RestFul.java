package com.slq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 * @author qingqing
 * @function:
 * @create 2021-02-06-17:34
 */
@Controller
public class Helloweb_RestFul {

    /*
    RestFul风格
    传统方式操作资源  ：http://127.0.0.1/item/queryItem.action?id=1 查询,GET
    RestFul风格      ：http://127.0.0.1/item/1 查询,GET
     */

//    @RequestMapping("/add/{a}/{b}")  //前端访问页面的地址
    @GetMapping("/add/{a}/{b}")  //网页后缀都是/add/{a}/{b}，用不同注解变体区分实际功能
    public String test03(@PathVariable int a, @PathVariable String b, Model model){
        String result = b+a;
        /*
        封装参数，向模型中添加属性msg的值，可以在jsp页面取出并渲染
         */
        model.addAttribute("msg","结果1是："+result);
        /*
        返回的字符串会被 视图解析器捕获、处理
         */
        return "mainweb";  //返回真正的jsp文件名
    }

    @PostMapping("/add/{a}/{b}")  //网页后缀都是/add/{a}/{b}，用不同注解变体区分实际功能
    public String test04(@PathVariable int a, @PathVariable int b, Model model){
        int result = b+a;
        /*
        封装参数，向模型中添加属性msg的值，可以在jsp页面取出并渲染
         */
        model.addAttribute("msg","结果2是："+result);
        /*
        返回的字符串会被 视图解析器捕获、处理
         */
        return "mainweb";  //返回真正的jsp文件名
    }
}
