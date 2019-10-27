package org.hzg.springboot;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * Created by hzgal on 2019-10-27.
 */
@WebFilter("/testServlet.do")
public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("======================拦截到了testServlet.do请求============================");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
