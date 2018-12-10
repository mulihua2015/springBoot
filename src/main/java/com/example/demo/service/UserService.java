package com.example.demo.service;

import com.example.demo.pojo.User;

public interface UserService {

    public User login(String username,String password);

    public String getUserInfo();

    public String deleteById(String id);

    public String queryById();
    public String masterById();

    public String devById();

    public String masterUpdate();

    public String mastered();
}
