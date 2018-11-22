package com.team.adminserver.service;

import com.team.adminserver.vo.AdminVo;
import com.team.facade.pojo.Admin;

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

    void  deleteAdmin(Admin admin);

    void  updateAdmin(Admin admin);
}
