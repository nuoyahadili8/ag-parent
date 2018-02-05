package com.github.learning.gate.filter;

import com.alibaba.fastjson.JSON;
import com.github.learning.common.constant.CommonConstants;
import com.github.learning.common.msg.BaseResponse;
import com.github.learning.common.util.jwt.IJWTInfo;
import com.github.learning.gate.utils.JWTUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;

@Component
public class AccessFilter extends ZuulFilter {

    @Autowired
    private JWTUtil jwtUtil;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        //做校验
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        if(request.getRequestURI().substring("/api".length()).startsWith("/auth/jwt")){
            return null;
        }
        String token=request.getHeader("access-token");
        try {
            IJWTInfo infoFromToken = jwtUtil.getInfoFromToken(token);
//            assertEquals(infoFromToken.getUniqueName(),"admin");
        } catch (Exception e) {
            context.setResponseBody(JSON.toJSONString(new BaseResponse(CommonConstants.EX_TOKEN_ERROR_CODE,"Token Error or Token is Expired!")));
            e.printStackTrace();
        }
        return null;
    }
}
