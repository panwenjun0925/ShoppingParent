package com.team.adminserver.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.adminserver.service.AdminService;
import com.team.facade.IFacade.IAdminFacade;
import com.team.facade.pojo.Admin;
import com.team.facade.vo.AdminVo.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 20:18
 * @Description:
 * @Version: 1.0
 */
@Service
public class AdminFacade implements IAdminFacade {

    @Autowired
    AdminService adminService;

    @Override
    public void add(Admin admin) {
        adminService.addAdmin(admin);
    }

    @Override
    public List<Admin> findBy(AdminVo adminVo) {
        return adminService.findBy(adminVo);
    }


    @Override
    public void delete(Integer id) {
        adminService.deleteAdmin(id);
    }

    @Override
    public void update(Admin admin) {
        adminService.updateAdmin(admin);
    }
}
