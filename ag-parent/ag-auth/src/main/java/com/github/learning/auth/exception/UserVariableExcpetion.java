package com.github.learning.auth.exception;

import com.github.learning.common.constant.CommonConstants;
import com.github.learning.common.exception.BaseException;

public class UserVariableExcpetion extends BaseException {

    public UserVariableExcpetion(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
