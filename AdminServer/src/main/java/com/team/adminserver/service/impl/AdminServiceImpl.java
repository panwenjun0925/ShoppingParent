package com.team.adminserver.service.impl;

import com.team.adminserver.mapper.AdminMapper;
import com.team.adminserver.service.AdminService;
import com.team.adminserver.vo.AdminVo;
import com.team.facade.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 19:55
 * @Description:
 * @Version: 1.0
 */
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminMapper adminMapper;

    @Override
    public void addAdmin(Admin admin) {
        adminMapper.add(admin);
    }

    @Override
    public List<Admin> findBy(AdminVo adminVo) {
        return adminMapper.findBy(adminVo);
    }

    @Override
    public Admin findById(AdminVo adminVo) {
        List<Admin> list = adminMapper.findBy(adminVo);
        return list.get(0);
    }

    @Override
    public void deleteAdmin(Admin admin) {
        adminMapper.delete(admin.getAdminId());
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminMapper.update(admin);
    }
}
