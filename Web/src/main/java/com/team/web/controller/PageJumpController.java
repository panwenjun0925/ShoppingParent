package com.team.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: YouQi
 * @Date: 2018/11/24 10:15
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("page")
public class PageJumpController {

    @RequestMapping("pubTop")
    public String jumpTop(){
        return "top";
    }

    @RequestMapping("pubLeft")
    public String jumpLeft(){
        return "left";
    }

    @RequestMapping("index")
    public String jumpIndex(){
        return "pagejump";
    }

}
