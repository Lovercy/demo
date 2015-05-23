package com.demo.dao;

import com.demo.model.User;


public interface UserMapper {
    int delById(String userid);

    int add(User user);

    User getById(String userid);

    int update(User user);

}