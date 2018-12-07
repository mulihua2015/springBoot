package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/delete2")
    public String delete2(){
        return "delete2";
    }

    @RequestMapping("/delete3")
    public String delete3(){
        return "delete2";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }


    @RequestMapping("/query")
    public String query(){
        return "query";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "delete2";
    }



}
