package com.team.test.junit;

import com.team.facade.pojo.OrderDes;
import com.team.order.AppStart;
import com.team.order.mapper.OrderDesMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/22 10:31
 * @Description:
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class)
public class TestOrderDes {

    @Autowired
    OrderDesMapper mapper;

    @Test
    public void testGetOrderDesByCondition() throws Exception {
        OrderDes orderDes = new OrderDes();
        orderDes.setGoodsId(1);
        orderDes.setOrderDesId(1);
        List<OrderDes> desList = mapper.getOrdersByConditon(orderDes);
        for (OrderDes des : desList) {
            System.out.println(des);
        }
    }

    @Test
    public void testAddOrderDes() throws Exception {
        OrderDes orderDes = new OrderDes(1, 20, "2018001", 1, 2);
        int i = mapper.addOrderDes(orderDes);
        System.out.println(i);
    }

    @Test
    public void testDelOrderDes() throws Exception {
        int i = mapper.delOrderDesByDesId(1);
        System.out.println(i);
    }

    @Test
    public void testUpdateOrderDes() throws Exception {
        OrderDes orderDes = new OrderDes(2, 20, "2018001", 1, 2);
        int i = mapper.updateOrderDes(orderDes);
        System.out.println(i);
    }

}
