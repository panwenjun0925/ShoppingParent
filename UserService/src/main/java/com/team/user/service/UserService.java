package com.team.user.service;

import com.team.facade.pojo.User;
import com.team.user.vo.UserVo;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 12:27
 * @Description:
 * @Version: 1.0
 */
public interface UserService {
    List<User> getAll(UserVo userVo);

    int add(User user);

    int update(User user);

    int deleteById(User user);

}
