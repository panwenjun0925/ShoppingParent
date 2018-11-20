package com.team.order.controller;

import com.team.facade.pojo.Order;
import com.team.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 20:36
 * @Description:
 * @Version: 1.0
 */
@Controller
public class OrderController {

    @Autowired
    OrderService service;

    @RequestMapping("/list")
    @ResponseBody
    public List<Order> getAll(){
        return service.getAll();
    }
}
