package com.slq.controler;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.crypto.spec.IvParameterSpec;
import javax.print.attribute.Attribute;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author qingqing
 * @function:
 * @create 2021-02-05-21:26
 */
public class Helloservlet implements Controller {
    /*
    继承Controller接口
    就要重写handleRequest方法
     */
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        /*
        页面的返回值
         */
        String output = "qingqing fighting";
        mv.addObject("msg", output);

        /*
        视图跳转
         */
        mv.setViewName("/test");
        System.out.println(mv);
        return mv;
    }
}
