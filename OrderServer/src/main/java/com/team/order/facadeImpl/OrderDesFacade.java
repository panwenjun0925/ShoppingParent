package com.team.order.facadeImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.facade.IFacade.IOrderDesFacade;
import com.team.facade.pojo.OrderDes;
import com.team.order.service.OrderDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/22 12:13
 * @Description:
 * @Version: 1.0
 */
@Service
@Component
public class OrderDesFacade implements IOrderDesFacade {

    @Autowired
    OrderDesService service;

    @Override
    public List<OrderDes> getOrderDesByConditon(OrderDes orderDes) {
        return service.getOrderDesByConditon(orderDes);
    }

    @Override
    public int addOrderDes(OrderDes orderDes) {
        return service.addOrderDes(orderDes);
    }

    @Override
    public int delOrderDesByDesId(int id) {
        return service.delOrderDesByDesId(id);
    }

    @Override
    public int updateOrderDes(OrderDes orderDes) {
        return service.updateOrderDes(orderDes);
    }
}
