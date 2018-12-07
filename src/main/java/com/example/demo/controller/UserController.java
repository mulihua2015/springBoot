package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping("/delete4")
    public String delete(){
        return "delete4";
    }


    @RequestMapping("/delete5")
    public String delete5(){
        return "delete5";
    }


}
