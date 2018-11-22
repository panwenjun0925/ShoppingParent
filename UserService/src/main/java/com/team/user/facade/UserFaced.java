package com.team.user.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.facade.IFacade.IUserFacade;
import com.team.facade.pojo.User;
import com.team.facade.vo.userVo.UserVo;
import com.team.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 16:35
 * @Description:
 * @Version: 1.0
 */
@Service
public class UserFaced implements IUserFacade {
    @Autowired
    private UserService userService;


    @Override
    public List<User> getAll(UserVo userVo) {
        return userService.getAll(userVo);
    }

    @Override
    public int add(User user) {
        return userService.add(user);
    }

    @Override
    public int deleteById(User user) {
        return userService.update(user);
    }

    @Override
    public int update(User user) {
        return userService.update(user);
    }
}
