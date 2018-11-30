package com.team.user.service.impl;

import com.team.facade.pojo.User;
import com.team.facade.vo.userVo.UserVo;
import com.team.user.mapper.UserMapper;
import com.team.user.service.UserService;
import com.team.user.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 12:28
 * @Description:
 * @Version: 1.0
 */
@Component
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll(UserVo userVo) {
        return mapper.getAll(userVo);
    }

    @Override
    public int add(User user) {
        user.setUserNumber(UserUtil.getNum());
        user.setRegisterTime(UserUtil.getResisterTime());
        String pwd=UserUtil.encryption(user.getPassword());
        user.setPassword(pwd);
        user.setUserNick(user.getUserName());
        return mapper.add(user);
    }

    @Override
    public int update(User user) {
        return mapper.update(user);
    }

    @Override
    public int deleteById(User user) {
        return mapper.deleteById(user);
    }
}
