package com.slq.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-26-14:31
 */
//进入HandlerInterceptor，可以看到重要的接口
public class Interceptor implements HandlerInterceptor {
    //preHandle方法在控制器的处理请求方法调用之后，解析视图之前执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("_____处理前______");
        return false;
    }
    //postHandle方法在控制器的处理请求方法调用之后，解析视图之前执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("_____处理后______");
    }

    //afterCompletion方法在控制器的处理请求方法执行完成后执行，即视图渲染结束之后执行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("_____完成______");
    }
}
