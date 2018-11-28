package com.team.order.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.team.facade.pojo.Order;
import com.team.facade.dto.PageHelpDto;
import com.team.order.mapper.OrderMapper;
import com.team.order.service.OrderDesService;
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
    @Autowired
    OrderDesService desService;


    @Override
    public PageHelpDto<Order,Order> getOrderByCondition(Order order, Integer pageIndex, Integer pageSize) {
        Page page = PageHelper.startPage(pageIndex, pageSize,"orderId desc");
        List<Order> orderList = mapper.getOrderByCondition(order);
        int totalCount = Integer.parseInt(page.getTotal()+"");//数据总条数
        int pageCount = page.getPages();//总页数
        PageHelpDto<Order, Order> p = new PageHelpDto<Order, Order>(pageIndex, totalCount, pageSize, pageCount, orderList,order);
        return p;
    }

    @Override
    public Order getOrderById(int id) {
        return mapper.getOrderById(id);
    }
    @Override
    public int addOrder(Order order) {
        return mapper.addOrder(order);
    }

    @Override
    public int delOrderByOrderId(int id) {
        desService.delOrderDesByOrderId(id);
        return mapper.delOrderByOrderId(id);
    }

    @Override
    public int updateOrder(Order order) {
        return mapper.updateOrder(order);
    }
}
