package com.team.order.service.Impl;

import com.team.facade.pojo.OrderDes;
import com.team.order.mapper.OrderDesMapper;
import com.team.order.service.OrderDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/21 23:46
 * @Description:订单详情的service实现类
 * @Version: 1.0
 */
@Service
public class OrderDesServiceImpl implements OrderDesService {

    @Autowired
    OrderDesMapper orderDesMapper;

    @Override
    public List<OrderDes> getOrderDesByConditon(OrderDes orderDes) {
        return orderDesMapper.getOrderDesByConditon(orderDes);
    }

    @Override
    public int addOrderDes(OrderDes orderDes) {
        return orderDesMapper.addOrderDes(orderDes);
    }

    @Override
    public int delOrderDesByDesId(int id) {
        return orderDesMapper.delOrderDesByDesId(id);
    }

    @Override
    public int updateOrderDes(OrderDes orderDes) {
        return orderDesMapper.updateOrderDes(orderDes);
    }
}
