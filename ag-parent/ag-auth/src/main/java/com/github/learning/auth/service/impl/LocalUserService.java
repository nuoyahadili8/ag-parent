package com.github.learning.auth.service.impl;

import com.github.learning.common.exception.auth.UserInvalidException;
import com.github.learning.auth.bean.UserInfo;
import com.github.learning.auth.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class LocalUserService implements UserService {
    @Override
    public UserInfo login(String username, String password) {
        //这里可以变成从user-center中获取
        UserInfo info=new UserInfo("admin","管理员","1","123456");

        System.out.println(">>>>>>>>>>>>>>>>>>>"+info.getUniqueName());
        System.out.println(">>>>>>>>>>>>>>>>>>>"+info.getPassword());

        if(info.getUniqueName().equals(username) && info.getPassword().equals(password)){
            return info;
        }else{
            throw new UserInvalidException("User Password Error!");
        }
    }
}
