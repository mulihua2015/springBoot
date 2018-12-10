package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public User login(@RequestParam(name = "username",defaultValue = "test") String username){
        return userService.login(username, "psd");
    }

    @RequestMapping("/master")
    public String master(){
        return "master";
    }

    @RequestMapping("/masterUpdate")
    public String masterUpdate(){
        return "masterUpdate";
    }

}
