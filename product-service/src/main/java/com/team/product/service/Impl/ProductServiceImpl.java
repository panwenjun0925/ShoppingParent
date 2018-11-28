package com.team.product.service.Impl;

import com.team.facade.pojo.Goods;
import com.team.product.mapper.GoodsMapper;
import com.team.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/20 19:01
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public List<Goods> getList() {


        return goodsMapper.queryList();
    }

    @Override
    public Integer insertSlective(Goods goods) {
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public List<Goods> queryGoodsByExample(Goods goods) {
        return goodsMapper.queryGoodsByExample(goods);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKeySelective(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public List<Goods> queryUnPutaway() {
        return goodsMapper.queryUnPutaway();
    }

    @Override
    public Goods queryByPrimaryKey(Integer id) {
        return goodsMapper.queryByPrimaryKey(id);
    }
}
