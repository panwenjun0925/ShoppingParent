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
@RequestMapping("/order")
public class OrderController {

    @Reference
    IOrderFacade orderFacade;

    @RequestMapping("/getAllOrder")
    @ResponseBody
    public List<Order> getAll(Order order){
        return orderFacade.getOrderByCondition(order);
    }

    @RequestMapping("/addOrder")
    public String addOrder(Order order){
        orderFacade.addOrder(order);
        return "";
    }

    @RequestMapping("/delOrder")
    public String delOrder(int id){
        orderFacade.delOrderByOrderId(id);
        return  "";
    }

    @RequestMapping("/updateOrder")
    public String updateOrder(Order order){
        orderFacade.updateOrder(order);
        return "";
    }

}
