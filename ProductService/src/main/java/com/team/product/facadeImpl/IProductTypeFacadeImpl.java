package com.team.product.facadeImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.facade.IFacade.IProductTypeFacade;
import com.team.facade.pojo.GoodsType;
import com.team.product.mapper.GoodsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/22 12:46
 * @Description:
 * @Version: 1.0
 */
@Service
@Component
public class IProductTypeFacadeImpl implements IProductTypeFacade {

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
