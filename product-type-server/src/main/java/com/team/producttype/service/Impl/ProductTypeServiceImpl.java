package com.team.producttype.service.Impl;


import com.team.facade.pojo.GoodsType;


import com.team.producttype.mapper.GoodsTypeMapper;
import com.team.producttype.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    @Override
    public List<GoodsType> queryList() {
        return goodsTypeMapper.queryList();
    }

    @Override
    public GoodsType queryByPrimaryKey(Integer Id) {
        return goodsTypeMapper.queryByPrimaryKey(Id);
    }

    @Override
    public List<GoodsType> queryGoodsTypeByExample(GoodsType goods) {
        return goodsTypeMapper.queryGoodsTypeByExample(goods);
    }

    @Override
    public Integer insertSelective(GoodsType goods) {
        return goodsTypeMapper.insertSelective(goods);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return goodsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKeySelective(GoodsType goods) {
        return goodsTypeMapper.updateByPrimaryKeySelective(goods);
    }
}
