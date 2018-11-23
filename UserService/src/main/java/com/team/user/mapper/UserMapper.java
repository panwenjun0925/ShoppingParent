package com.team.user.mapper;

import com.team.facade.pojo.User;
import com.team.facade.vo.userVo.UserVo;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 12:24
 * @Description:
 * @Version: 1.0
 */
public interface UserMapper {
    List<User> getAll(UserVo userVo);

    int add(User user);

    int update(User user);

    int deleteById(User user);

}
