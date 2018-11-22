package com.team.product.service.Impl;

import com.team.facade.pojo.GoodsDes;
import com.team.product.mapper.GoodsDesMapper;
import com.team.product.service.ProductDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 16:16
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProductDesServiceImpl implements ProductDesService {

    @Autowired
    private GoodsDesMapper goodsDesMapper;

    @Override
    public List<GoodsDes> queryList() {
        return goodsDesMapper.queryList();
    }

    @Override
    public GoodsDes queryByPrimaryKey(Integer Id) {
        return goodsDesMapper.queryByPrimaryKey(Id);
    }

    @Override
    public List<GoodsDes> queryGoodsDesByExample(GoodsDes goods) {
        return goodsDesMapper.queryGoodsDesByExample(goods);
    }

    @Override
    public Integer insertSelective(GoodsDes goods) {
        return goodsDesMapper.insertSelective(goods);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return goodsDesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKeySelective(GoodsDes goods) {
        return goodsDesMapper.updateByPrimaryKeySelective(goods);
    }
}
