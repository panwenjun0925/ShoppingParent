package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IAdminFacade;
import com.team.facade.pojo.Admin;
import com.team.facade.vo.AdminVo.AdminVo;
import com.team.facade.vo.AdminVo.ConstomAdmin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @Reference(timeout = 10000)
    private IAdminFacade adminFacade;

    @RequestMapping("/list")
    public String getAll(AdminVo adminVo, Model model){
        List<Admin> adminList = adminFacade.findBy(adminVo);
        model.addAttribute("admins",adminList);
        return  "admin_list";
    }

    @RequestMapping("/add")
    public String addAd(Admin admin){
        adminFacade.add(admin);
        return "redirect:/admin/list";
    }

    @RequestMapping("/delete")
    public String deleteAd(Admin admin){
        adminFacade.delete(admin);
        return "redirect:/admin/list";
    }

    @RequestMapping("/update")
    public String updateAd(Admin admin){
        adminFacade.update(admin);
        return  "redirect:/admin/list";
    }

    @RequestMapping("/login")
    public String login(ConstomAdmin constomAdmin){
        AdminVo adminVo = new AdminVo();
        adminVo.setConstomAdmin(constomAdmin);
        List<Admin> list = adminFacade.findBy(adminVo);
        boolean empty = list.isEmpty();
        if(!empty){
            return "index";
        }else {
            return "login";
        }
    }
}
