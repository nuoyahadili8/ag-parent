package com.github.learning.common.exception.auth;


import com.github.learning.common.constant.CommonConstants;
import com.github.learning.common.exception.BaseException;

/**
 * Created by ace on 2017/9/10.
 */
public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
