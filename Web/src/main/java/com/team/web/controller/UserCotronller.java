package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IUserFacade;
import com.team.facade.pojo.User;
import com.team.facade.vo.userVo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/23 10:26
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserCotronller {
    @Reference(timeout = 10000)
    private IUserFacade facade;

    @RequestMapping("/login")
    public String login(UserVo userVo){
        List<User> all = facade.getAll(userVo);
        if(null!=all.get(0)){
            return "登陆成功";
        }else {
            return "没有你";
        }
    }

    @RequestMapping("/getAll")
    public String getALl(UserVo userVo, Model model){
        List<User> all = facade.getAll(userVo);
        model.addAttribute("users",all);
        return "user_list";
    }
    @PostMapping("/addUser")
    public String addUser(User user){
        facade.add(user);
        return "redirect:/user/getAll";
    }

    @PostMapping("updateUser")
    public String updateUser(User user){
        facade.update(user);
        return "redirect:/user/getAll";
    }

    @PostMapping("/delete")
    public String deleteById(User user){
        facade.deleteById(user);
        return "redirect:/user/getAll";
    }

}
