package com.team.adminserver.service;

import com.team.facade.pojo.Admin;
import com.team.facade.vo.AdminVo.AdminVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 19:54
 * @Description:
 * @Version: 1.0
 */
public interface AdminService {

    void  addAdmin(Admin admin);

    List<Admin> findBy(AdminVo adminVo);

    Admin findById(AdminVo adminVo);

    void  deleteAdmin(Integer id);

    void  updateAdmin(Admin admin);
}
