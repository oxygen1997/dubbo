package com.zy.dubbo.service.user.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zy.dubbo.service.user.api.UserService;
import com.zy.dubbo.service.user.common.pojo.User;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        User user = new User(10000L, "陈彦祖", "23", "179cm", "65KG");
        return user;
    }
}
