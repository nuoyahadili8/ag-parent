package com.github.learning.uc.rest;

import com.github.learning.common.context.BaseContextHandler;
import com.github.learning.common.rest.BaseController;
import com.github.learning.uc.biz.BaseUserBiz;
import com.github.learning.uc.entity.BaseUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserRest extends BaseController<BaseUserBiz,BaseUser>{


    @RequestMapping("/who")
    public String getCurrentUser(){
        return BaseContextHandler.getUserName();
    }

}
