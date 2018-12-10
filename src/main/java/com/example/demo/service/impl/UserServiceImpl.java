package com.example.demo.service.impl;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String deleteById(String id) {
        return null;
    }

    @Override
    public User login(String username, String password) {
        User user=new User();
        user.setName(username);
        user.setPassword(password);
        user.setCreateTime(new Date());
        user.setRemark("remark");
        user.setSex("female");
        return user;
    }

    @Override
    public String getUserInfo() {
        return null;
    }

    @Override
    public String queryById() {
        return null;
    }

    @Override
    public String masterById() {
        return null;
    }

    @Override
    public String devById() {
        return null;
    }

    public String masterUpdate(){
        return null;
    }

    @Override
    public String mastered() {
        return null;
    }
}
