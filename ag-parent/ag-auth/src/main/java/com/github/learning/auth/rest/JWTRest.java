package com.github.learning.auth.rest;

import com.github.learning.common.msg.ObjectRestResponse;
import com.github.learning.auth.bean.UserInfo;
import com.github.learning.auth.service.UserService;
import com.github.learning.auth.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jwt")
public class JWTRest {

    @Autowired
    private JWTUtil jwtUtil;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/token",method = RequestMethod.POST)
    public ObjectRestResponse<String> authorize(String username,String password) throws Exception {
        //1、校验账户合法性
        UserInfo userInfo=userService.login(username,password);
        //2、合法则生成token
        return new ObjectRestResponse<String>().data(jwtUtil.generateToken(userInfo));
        //3、返回：status 401
    }
}
