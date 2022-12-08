package com.sgcc.epri.auth.controller;

import com.sgcc.epri.auth.entity.User;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);
    @GetMapping("getUserInfo")
    public User getUserInfo(){
        return new User("齐智","男",18);
    }
}
