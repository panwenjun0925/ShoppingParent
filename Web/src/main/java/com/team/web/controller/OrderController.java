package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IOrderFacade;
import com.team.facade.pojo.Order;
import com.team.facade.dto.PageHelpDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


    @RequestMapping("/getAllOrder/{pageIndex}")
    public String getAll(Order order, @PathVariable("pageIndex") Integer pageIndex, @RequestParam(defaultValue = "5") Integer pageSize, Model model){
        PageHelpDto<Order, Order> p = orderFacade.getOrderByCondition(order, pageIndex, pageSize);
        model.addAttribute("p",p);
        return "Order/order_list";
    }

    @RequestMapping("/getById/{id}")
    public String getOrderById(@PathVariable("id") Integer id,Model model){
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
        return  "redirect:/order/getAllOrder/1";
    }

    @RequestMapping("/updateOrder")
    public String updateOrder(Order order){
        int orderId = order.getOrderId();
        orderFacade.updateOrder(order);
        return "redirect:/order/getById/"+orderId;
    }









}
