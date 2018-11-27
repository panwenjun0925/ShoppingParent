package com.team.test.junit;

import com.team.facade.pojo.Order;
import com.team.order.AppStart;
import com.team.order.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/22 10:12
 * @Description:
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class)
public class TestOrder {
    @Autowired
    OrderMapper mapper;

    @Test
    public void testGetOrderByCondition() throws Exception {
        Order order = new Order();
        order.setOrderId(1);
        order.setOrderNum("2018001");
        List<Order> orders = mapper.getOrderByCondition(order);
        for (Order order1 : orders) {
            System.out.println(order1);
        }
    }

    @Test
    public void testAddOrder() throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        Order order = new Order(1, "2018002", 2, s, s, 2, 300.0,1,"aa", 2,"11", 2,"22");
        int i = mapper.addOrder(order);
        System.out.println(i);
    }
    @Test
    public void testDelOrderById() throws Exception {
        int i = mapper.delOrderByOrderId(1);
        System.out.println(i);
    }

    @Test
    public void testUpdateOrder() throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        Order order = new Order(2, "2018002", 2, s, s, 2, 300.0,1,"aa", 2,"11", 2,"22");
        int i = mapper.updateOrder(order);
        System.out.println(i);
    }

}
