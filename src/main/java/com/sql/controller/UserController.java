package com.sql.controller;

import com.sql.entity.userInfo;
import com.sql.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author louis
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private userService userService;

    @RequestMapping("/insertUser")
    public int insertUser(userInfo userInfo){
        //对参数进行简单处理

        userInfo.setEid(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }
}
