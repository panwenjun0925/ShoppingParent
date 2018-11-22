package com.team.order.FacadeImpl;

import com.team.facade.IFacade.IOrderFacade;
import com.team.facade.pojo.Order;
import com.team.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/22 12:10
 * @Description:中间服务的实现
 * @Version: 1.0
 */
public class OrderFacade implements IOrderFacade {
    @Autowired
    OrderService service;

    @Override
    public List<Order> getOrderByCondition(Order order) {
        return service.getOrderByCondition(order);
    }

    @Override
    public int addOrder(Order order) {
        return service.addOrder(order);
    }

    @Override
    public int delOrderByOrderId(int id) {
        return service.delOrderByOrderId(id);
    }

    @Override
    public int updateOrder(Order order) {
        return service.updateOrder(order);
    }
}
