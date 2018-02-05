package com.github.learning.uc.interceptor;


import com.github.learning.common.context.BaseContextHandler;
import com.github.learning.common.util.jwt.IJWTInfo;
import com.github.learning.uc.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class JWTInterceptor extends HandlerInterceptorAdapter {

    @Value("${jwt.token-header}")
    private String tokenHeader;

    @Autowired
    private JWTUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(tokenHeader);
        IJWTInfo infoFromToken = jwtUtil.getInfoFromToken(token);
        BaseContextHandler.setName(infoFromToken.getName());
        BaseContextHandler.setUserID(infoFromToken.getId());
        BaseContextHandler.setUserName(infoFromToken.getUniqueName());
        return super.preHandle(request, response, handler);
    }
}
