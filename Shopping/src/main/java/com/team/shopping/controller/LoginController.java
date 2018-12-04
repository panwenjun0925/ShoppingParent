package com.team.shopping.controller;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.validation.Assertion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @Auther: qin
 * @Date: 2018/11/27 22:45
 * @Description:
 * @Version: 1.0
 */
@Controller
public class LoginController {

    @RequestMapping("/test")
    public String list(HttpServletRequest request){
        Assertion assertion= (Assertion) request.getSession().getAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);
        Principal principal = assertion.getPrincipal();
        System.out.println("名字："+principal.getName());
        return "xbb";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String list1(){

        return "xbb1";
    }



}
