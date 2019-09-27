package com.ywb.dao;

import com.ywb.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CardDao {
    int add(User rc);
    boolean del(Integer id);
    boolean update(User user);
    List<User> getAll();
    User selectById(Integer id);
    User selectByName(String name);
    User selectByNumber(@Param(value = "number_online") int number);
    int count();
}
