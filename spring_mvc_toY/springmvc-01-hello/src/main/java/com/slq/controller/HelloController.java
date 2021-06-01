package com.slq.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//注意：这里我们先导入Controller接口
public class HelloController implements Controller {

   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
       //ModelAndView 模型和视图
       ModelAndView mv = new ModelAndView();

       //封装对象，放在ModelAndView中。
       /*
       将要显示的东西直接放到ModelAndView中
       1.addObject：存储数据，由mv携带返回
       2.setViewName:写明要跳转到哪里
        */
       mv.addObject("msg","HelloSpringMVC!");
       //封装要跳转的视图，放在ModelAndView中
       mv.setViewName("/hello"); //: 自动拼接/WEB-INF/jsp/hello.jsp

       /*
       ModelAndView:我想给前端带什么数据，并且指定要跳转到前端的哪个界面
        */
       return mv;
  }
}