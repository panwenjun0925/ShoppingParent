package com.team.order.mapper;

import com.team.facade.pojo.Order;
import com.team.facade.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderMapper {


    List<Order> getAllOrder();
    /**
     * 功能描述:通过条件查询订单
     *
     * @param: [order]
     * @return: java.util.List<com.team.facade.pojo.Order>
     * @auther: PWJ
     * @date: 2018/11/21 11:14
     **/
    List<Order> getOrderByCondition(Order order);
    /**
     * 功能描述:添加订单
     *
     * @param: [order]
     * @return: int
     * @auther: PWJ
     * @date: 2018/11/21 11:15
     **/
    int addOrder(Order order);

   /**
    * 功能描述:通过订单ID删除订单
    *
    * @param: [id]
    * @return: int
    * @auther: PWJ
    * @date: 2018/11/21 11:15
    **/
    int delOrderByOrderId(int id);
    /**
     * 功能描述:修改订单信息
     *
     * @param: [order]
     * @return: int
     * @auther: PWJ
     * @date: 2018/11/21 11:16
     **/
    int updateOrder(Order order);



}
