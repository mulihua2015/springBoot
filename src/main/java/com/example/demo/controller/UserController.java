package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/query")
    public String query(){
        return "query";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "delete";
    }
}
