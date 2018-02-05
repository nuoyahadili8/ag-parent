package com.github.learning.uc.biz;

import com.github.learning.common.biz.BaseBiz;
import com.github.learning.uc.entity.BaseUser;
import com.github.learning.uc.mapper.BaseUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BaseUserBiz extends BaseBiz<BaseUserMapper,BaseUser>{

    @Override
    public BaseUser selectById(Object id) {
        return super.selectById(id);
    }
}
