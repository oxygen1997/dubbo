package com.zy.dubbo.service.user.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.zy.dubbo.service.user.api.UserService;
import com.zy.dubbo.service.user.common.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "/api/user")
    public User getUser() {
        return userService.getUser();
    }
}