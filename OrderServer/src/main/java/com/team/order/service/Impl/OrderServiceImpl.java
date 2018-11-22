package com.team.order.service.Impl;

import com.team.facade.pojo.Order;
import com.team.order.mapper.OrderMapper;
import com.team.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 20:24
 * @Description:订单的service实现类
 * @Version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper mapper;
    @Override
    public List<Order> getOrderByCondition(Order order) {
        return mapper.getOrderByCondition(order);
    }

    @Override
    public int addOrder(Order order) {
        return mapper.addOrder(order);
    }

    @Override
    public int delOrderByOrderId(int id) {
        return mapper.delOrderByOrderId(id);
    }

    @Override
    public int updateOrder(Order order) {
        return mapper.updateOrder(order);
    }
}
