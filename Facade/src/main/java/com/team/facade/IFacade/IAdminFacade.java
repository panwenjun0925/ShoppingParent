package com.team.facade.IFacade;

import com.team.facade.pojo.Admin;
import com.team.facade.vo.AdminVo.AdminVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 19:31
 * @Description:
 * @Version: 1.0
 */
public interface IAdminFacade {
    /**
     * 功能描述:增添
     *
     * @param: [admin]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/21 17:57
     **/

    void add(Admin admin);

    /**
     * 功能描述: 查询
     *
     * @param: [adminVo]
     * @return: list<Admin>
     * @auther: daixiao
     * @date: 2018/11/21 17:58
     **/

    List<Admin> findBy(AdminVo adminVo);

    /**
     * 功能描述:删除
     *
     * @param: [admin]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/21 17:59
     **/

    void  delete(Admin admin);

    /**
     * 功能描述:更新
     *
     * @param: [admin]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/21 17:59
     **/

    void update(Admin admin);
}
