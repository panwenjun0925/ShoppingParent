package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IOrderFacade;
import com.team.facade.pojo.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
    private IOrderFacade orderFacade;


    @RequestMapping("/getAllOrder")
    public String getAll(Order order, Model model){
        model.addAttribute("order",order);
        List<Order> orderList = orderFacade.getOrderByCondition(order);
        model.addAttribute("orderList",orderList);
        return "Order/order_list";
    }

    @RequestMapping("/getById")
    public String getOrderById(Integer id,Model model){
        Order order = orderFacade.getOrderById(id);
        model.addAttribute("order",order);
        return "Order/order_detail";
    }

    @RequestMapping("/addOrder")
    public String addOrder(Order order){
        orderFacade.addOrder(order);
        return "";
    }

    @RequestMapping("/delOrderById/{id}")
    public String delOrderById(@PathVariable("id") int id){
        orderFacade.delOrderByOrderId(id);
        return  "redirect:/order/getAllOrder";
    }

    @RequestMapping("/updateOrder")
    public String updateOrder(Order order){
        orderFacade.updateOrder(order);
        return "";
    }









}
