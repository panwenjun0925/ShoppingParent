package com.team.producttype.facadeImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.facade.IFacade.IProductTypeFacade;
import com.team.facade.pojo.GoodsType;

import com.team.producttype.service.ProductTypeService;
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
    private ProductTypeService productTypeService;


    @Override
    public List<GoodsType> queryList() {
        return productTypeService.queryList();
    }

    @Override
    public GoodsType queryByPrimaryKey(Integer Id) {
        return productTypeService.queryByPrimaryKey(Id);
    }

    @Override
    public List<GoodsType> queryGoodsTypeByExample(GoodsType goods) {
        return productTypeService.queryGoodsTypeByExample(goods);
    }

    @Override
    public Integer insertSelective(GoodsType goods) {
        return productTypeService.insertSelective(goods);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return productTypeService.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKeySelective(GoodsType goods) {
        return productTypeService.updateByPrimaryKeySelective(goods);
    }

    @Override
    public List<GoodsType> selectByParentId(Integer parentTypeId) {
        return productTypeService.selectByParentId(parentTypeId);
    }


}
