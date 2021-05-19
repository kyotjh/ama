package com.listener;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//监听servlet 上下文
public class SvContext implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servlet 上下文 创建了。。。");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servlet 上下文 销毁。。。");
    }
}
