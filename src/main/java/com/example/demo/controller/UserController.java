package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/master")
    public String master(){
        return "master";
    }

    @RequestMapping("/dev")
    public String dev(){
        return "dev";
    }

    @RequestMapping("/mastered")
    public String mastered(){
        return "mastered";
    }



}
