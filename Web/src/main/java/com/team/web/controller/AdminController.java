package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IAdminFacade;
import com.team.facade.pojo.Admin;
import com.team.facade.vo.AdminVo.AdminVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/23 10:55
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Reference
    private IAdminFacade adminFacade;

    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> getAll(AdminVo adminVo, Model model){
        List<Admin> adminList = adminFacade.findBy(adminVo);
        model.addAttribute("admins",adminList);
        return  adminList;
    }

    @RequestMapping("/add")
    public String addAd(Admin admin){
        adminFacade.add(admin);
        return "";
    }

    @RequestMapping("/delete")
    public String deleteAd(Admin admin){
        adminFacade.delete(admin);
        return "";
    }

    @RequestMapping("/update")
    public String updateAd(Admin admin){
        adminFacade.update(admin);
        return  "";
    }

    @RequestMapping("/login")
    public String login(){

        return "";
    }
}