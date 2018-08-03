package com.example.controller;

import com.example.Service.UserService;
import com.example.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yueminrui on 2018/7/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public UserInfo getUser(@PathVariable("username")String userName){
        return userService.findByName(userName);
    }
}
