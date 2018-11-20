package com.team.order.mapper;

import com.team.facade.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderMapper {

     List<Order> getAll();
}
