package com.team.product.service.Impl;


import com.team.product.mapper.GoodsTypeMapper;
import com.team.product.service.ProductTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 17:22
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;




}
