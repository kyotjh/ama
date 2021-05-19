package com.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter....init");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter....doFilter");
        //filterChain.doFilter(req,resp);
        HttpServletResponse hsr = (HttpServletResponse)resp;
        hsr.sendRedirect("login.jsp");
    }

    public void destroy() {
        System.out.println("MyFilter....destroy");
    }
}
