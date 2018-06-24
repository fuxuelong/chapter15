package com.cnhtcqk.userservice.controller;

import com.cnhtcqk.userservice.dto.UserLoginDTO;
import com.cnhtcqk.userservice.entity.User;
import com.cnhtcqk.userservice.service.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/6/1.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceDetail userServiceDetail;

    @PostMapping("/register")
    public User postUser(@RequestParam("username") String username , @RequestParam("password") String password){
        //参数判断，省略
        return userServiceDetail.insertUser(username,password);
    }
    @PostMapping("/login")
    public UserLoginDTO login(@RequestParam("username") String username,@RequestParam("password") String password){
        return userServiceDetail.login(username,password);
    }

}