package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IOrderDesFacade;
import com.team.facade.pojo.OrderDes;
import org.springframework.stereotype.Controller;
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
    private IOrderDesFacade orderDesFacade;

    @RequestMapping("/getAllOrderDes")
    public String getAllOrderDes(OrderDes orderDes){
        List<OrderDes> orderDesByConditon = orderDesFacade.getOrderDesByConditon(orderDes);
        return "";
    }

}
