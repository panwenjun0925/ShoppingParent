package com.team.product.facadeImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageInfo;
import com.team.facade.IFacade.IProductFacade;
import com.team.facade.pojo.Goods;
import com.team.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/22 12:42
 * @Description:
 * @Version: 1.0
 */
@Service
@Component
public class IProductFacadeImpl implements IProductFacade {

    @Autowired
    private ProductService productService;


    @Override
    public PageInfo<Goods> getList(Integer pageNum) {
        return productService.getList( pageNum);
    }

    @Override
    public Integer insertSlective(Goods goods) {
        return productService.insertSlective(goods);
    }

    @Override
    public List<Goods> queryGoodsByExample(Goods goods) {
        return productService.queryGoodsByExample(goods);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return productService.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKeySelective(Goods goods) {
        return productService.updateByPrimaryKeySelective(goods);
    }

    @Override
    public List<Goods> queryUnPutaway() {
        return productService.queryUnPutaway();
    }

    @Override
    public Goods queryByPrimaryKey(Integer id) {
        return productService.queryByPrimaryKey(id);
    }

    @Override
    public List<Goods> queryAll() {
        return productService.queryAll();
    }

}
