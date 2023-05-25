package com.yinwang.loginmod.controller;

import com.yinwang.loginmod.domain.Ajax;
import com.yinwang.loginmod.domain.User;
import com.yinwang.loginmod.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @PostMapping("/login")
    public Ajax login(@Validated @RequestBody User user) {
        User res = userMapper.selectByIdAndPassword(user.getId(), user.getPassword());

        if (res != null) {
            return new Ajax(res, true);
        } else {
            return new Ajax(res, false);
        }
    }
}
