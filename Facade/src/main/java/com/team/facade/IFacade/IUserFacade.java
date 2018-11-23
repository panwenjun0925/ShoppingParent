package com.team.facade.IFacade;

import com.team.facade.pojo.User;
import com.team.facade.vo.userVo.UserVo;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 19:50
 * @Description:用户的服务
 * @Version: 1.0
 */
public interface IUserFacade {
    /**
     * @param: [userVo]
     * @return: java.util.List<com.team.facade.pojo.User>
     * @auther: qin
     * @date: 2018/11/22
     * @Description:根据条件查询所有
     **/

    List<User> getAll(UserVo userVo);

    /**
     * @param: [user]
     * @return: int
     * @auther: qin
     * @date: 2018/11/22
     * @Description:添加
     **/

    int add(User user);

    /**
     * @param: [user]
     * @return: int
     * @auther: qin
     * @date: 2018/11/22
     * @Description:根据Id删除
     **/

    int deleteById(User user);

    /**
     * @param: [user]
     * @return: int
     * @auther: qin
     * @date: 2018/11/22
     * @Description:更新
     **/

    int update(User user);

}
