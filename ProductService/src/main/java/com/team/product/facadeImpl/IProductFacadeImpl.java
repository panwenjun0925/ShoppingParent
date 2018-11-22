package com.team.product.facadeImpl;

import com.team.facade.IFacade.IProductFacade;
import com.team.facade.pojo.Goods;
import com.team.product.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/22 12:42
 * @Description:
 * @Version: 1.0
 */
public class IProductFacadeImpl implements IProductFacade {

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

}
