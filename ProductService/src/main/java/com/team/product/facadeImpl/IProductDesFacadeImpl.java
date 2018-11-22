package com.team.product.facadeImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.facade.IFacade.IProductDesFacade;
import com.team.facade.pojo.GoodsDes;
import com.team.product.mapper.GoodsDesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/22 12:45
 * @Description:
 * @Version: 1.0
 */
@Service
@Component
public class IProductDesFacadeImpl implements IProductDesFacade {

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
