package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Fy_ on 2020/6/3 15:47
 */
public interface UserService {
    void save (User user);
    List<User> findAll();
}
