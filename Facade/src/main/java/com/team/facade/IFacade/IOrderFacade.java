package com.team.facade.IFacade;

import com.team.facade.pojo.Order;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/22 11:53
 * @Description:订单服务的中间中间工程
 * @Version: 1.0
 */
public interface IOrderFacade {
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
     * 功能描述:通过ID查询订单
     *
     * @param: [id]
     * @return: com.team.facade.pojo.Order
     * @auther: PWJ
     * @date: 2018/11/26 12:22
     **/
    Order getOrderById(int id);
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
