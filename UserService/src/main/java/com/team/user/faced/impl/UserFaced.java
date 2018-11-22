package com.team.user.faced.impl;

import com.team.facade.pojo.User;
import com.team.user.faced.IUserFaced;
import com.team.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 16:35
 * @Description:
 * @Version: 1.0
 */
public class UserFaced implements IUserFaced {
    @Autowired
    private UserService userService;

    @Override
    public List<User> getAll() {
        return userService.getAll(null);
    }

    @Override
    public void add(User user) {
        userService.add(null);
    }
}
