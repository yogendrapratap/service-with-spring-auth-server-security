package com.spring.servicewithspringauthserversecurity.filter;

import jakarta.servlet.*;

import java.io.IOException;


public class AuthoritiesLoggingAtFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Authentication Validation is in progress");
        chain.doFilter(request,response);
    }
}
