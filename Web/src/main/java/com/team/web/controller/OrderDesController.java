package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IOrderDesFacade;
import com.team.facade.pojo.OrderDes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
    IOrderDesFacade orderDesFacade;

    @RequestMapping("/getAllOrderDes")
    public String getAllOrderDes(OrderDes orderDes){
        List<OrderDes> orderDesByConditon = orderDesFacade.getOrderDesByConditon(orderDes);
        return "";
    }

    @RequestMapping("/addOrderDes")
    public String addOrderDes(OrderDes orderDes){
        orderDesFacade.addOrderDes(orderDes);
        return "";
    }

    @RequestMapping("/delOrderDesById/{id}")
    public String delOrderDesById(@PathVariable("id") int id){
        orderDesFacade.delOrderDesByDesId(id);
        return "";
    }

    @RequestMapping("/updateOrderDes")
    public String updateOrderDes(OrderDes orderDes){
        orderDesFacade.updateOrderDes(orderDes);
        return "";
    }


}
