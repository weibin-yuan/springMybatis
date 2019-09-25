package com.ywb.dao;

import com.ywb.entity.User;

import java.util.List;

public interface CardDao {
    int add(User rc);
    boolean del(Integer id);
    boolean update(User user);
    List<User> getAll();
    User selectById(Integer id);
    User selectByName(String name);
    User selectByNumber(int number);
    int count();
}
