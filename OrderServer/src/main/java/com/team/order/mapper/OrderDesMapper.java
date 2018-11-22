package com.team.order.mapper;

import com.team.facade.pojo.OrderDes;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: PWJ
 * @Date: 2018/11/21 23:20
 * @Description:订单详情的mapper接口
 * @Version: 1.0
 */
@Repository
@Mapper
public interface OrderDesMapper {

    /**
     * 功能描述:通过条件查询订单详情
     *
     * @param: [orderDes]
     * @return: java.util.List<com.team.facade.pojo.OrderDes>
     * @auther: PWJ
     * @date: 2018/11/21 23:25
     **/
    List<OrderDes> getOrderDesByConditon(OrderDes orderDes);
    /**
     * 功能描述:添加订单详情
     *
     * @param: [orderDes]
     * @return: int
     * @auther: PWJ
     * @date: 2018/11/21 23:26
     **/
    int addOrderDes(OrderDes orderDes);
    /**
     * 功能描述:通过订单详情ID删除订单详情
     *
     * @param: [id]
     * @return: int
     * @auther: PWJ
     * @date: 2018/11/21 23:27
     **/
    int delOrderDesByDesId(int id);
    /**
     * 功能描述:修改订单详情
     *
     * @param: [orderDes]
     * @return: int
     * @auther: PWJ
     * @date: 2018/11/21 23:27
     **/
    int updateOrderDes(OrderDes orderDes);

}
