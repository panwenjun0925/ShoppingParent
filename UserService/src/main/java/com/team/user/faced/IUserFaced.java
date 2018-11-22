package com.team.user.faced;

import com.team.facade.pojo.User;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 16:34
 * @Description:
 * @Version: 1.0
 */
public interface IUserFaced {
    List<User> getAll();

    void add(User user);
}
