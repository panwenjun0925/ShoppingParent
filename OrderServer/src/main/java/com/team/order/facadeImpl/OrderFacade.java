package com.team.order.facadeImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.facade.IFacade.IOrderFacade;
import com.team.facade.pojo.Order;
import com.team.facade.dto.PageHelpDto;
import com.team.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: PWJ
 * @Date: 2018/11/22 12:10
 * @Description:中间服务的实现
 * @Version: 1.0
 */
@Service
@Component
public class OrderFacade implements IOrderFacade {
    @Autowired
    OrderService service;

    @Override
    public PageHelpDto<Order,Order> getOrderByCondition(Order order, Integer pageIndex, Integer pageSize) {
        return service.getOrderByCondition(order,pageIndex,pageSize);
    }

    @Override
    public Order getOrderById(int id) {
        return service.getOrderById(id);
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
