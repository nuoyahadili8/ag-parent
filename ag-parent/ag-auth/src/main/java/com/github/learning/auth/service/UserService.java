package com.github.learning.auth.service;

import com.github.learning.auth.bean.UserInfo;

public interface UserService {

    UserInfo login(String username, String password);


}
