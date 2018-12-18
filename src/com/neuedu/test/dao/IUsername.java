package com.neuedu.test.dao;

import com.neuedu.test.pojo.User;

public interface IUsername {
    public int insert(User user);
    public User getone(String username);

}
