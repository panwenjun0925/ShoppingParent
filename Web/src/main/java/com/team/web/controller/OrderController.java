package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IOrderFacade;
import com.team.facade.pojo.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/22 11:09
 * @Description:
 * @Version: 1.0
 */
@Controller
public class OrderController {

    @Reference
    IOrderFacade orderFacade;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Order> getAll(){
        Order order = new Order();
        return orderFacade.getOrderByCondition(order);
    }



}
