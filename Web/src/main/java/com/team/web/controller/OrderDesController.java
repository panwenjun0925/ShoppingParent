package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IOrderDesFacade;
import com.team.facade.pojo.OrderDes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/22 12:16
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/orderDes")
public class OrderDesController {

    @Reference
    private IOrderDesFacade orderDesFacade;

    @RequestMapping("/getAllOrderDes")
    public String getAllOrderDes(OrderDes orderDes, Model model) {
        List<OrderDes> desList = orderDesFacade.getOrderDesByConditon(orderDes);
        model.addAttribute("orderDesList", desList);
        return "Order/order_detail";
    }

    @RequestMapping("/getOrderDesByOrderId/{id}")
    @ResponseBody
    public List<OrderDes> getOrderDesByOrderId(@PathVariable("id") int id) {
        List<OrderDes> orderDesList = orderDesFacade.getOrderDesByOrderId(id);
        return orderDesList;
    }

    @RequestMapping("/addOrderDes")
    public String addOrderDes(OrderDes orderDes) {
        orderDesFacade.addOrderDes(orderDes);
        return "";
    }

    @RequestMapping("/delOrderDesById/{id}")
    public String delOrderDesById(@PathVariable("id") int id) {
        orderDesFacade.delOrderDesByDesId(id);
        return "";
    }

    @RequestMapping("/updateOrderDes")
    public String updateOrderDes(OrderDes orderDes) {
        orderDesFacade.updateOrderDes(orderDes);
        return "";
    }


}
