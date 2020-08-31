package com.neusoft.dao;

import com.neusoft.domin.User;

public interface UserDao {
    public User login(User loginUser);
    public int register(User rgtUser);
}
