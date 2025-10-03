package com.spring.servicewithspringauthserversecurity.filter;

import jakarta.servlet.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;


public class AuthoritiesLoggingAfterFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(null != authentication) {
            System.out.printf("User %s is successfully authenticated and has the authorities %s ", authentication.getName(), authentication.getAuthorities().toString());
        }
        chain.doFilter(request,response);
    }
}
