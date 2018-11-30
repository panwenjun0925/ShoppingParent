package com.team.adminserver.service.impl;

import com.team.adminserver.mapper.AdminMapper;
import com.team.adminserver.service.AdminService;
import com.team.facade.pojo.Admin;
import com.team.facade.vo.AdminVo.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 19:55
 * @Description:
 * @Version: 1.0
 */
@Component
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
    public void deleteAdmin(Integer id) {
        adminMapper.delete(id);
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminMapper.update(admin);
    }
}
