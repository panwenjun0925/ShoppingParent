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
 * @Description:
 * @Version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper mapper;
    @Override
    public List<Order> getAll() {
        return mapper.getAll();
    }
}
