package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IProductTypeFacade;
import com.team.facade.pojo.GoodsType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 17:12
 * @Description:
 * @Version: 1.0
 */
@Controller
public class ProductTypeController {

    @Reference
    private IProductTypeFacade productTypeFacade;

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insertProductDes(GoodsType goodsType){
        productTypeFacade.insertSelective(goodsType);
        return "";
    }

    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public String deleteProductDes(@PathVariable Integer id){
        productTypeFacade.deleteByPrimaryKey(id);
        return "";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String updateProductDes(GoodsType goodsType){
        productTypeFacade.updateByPrimaryKeySelective(goodsType);
        return "";
    }

    @RequestMapping(value = "queryByExample",method = RequestMethod.POST)
    public String queryByExample(GoodsType goodsType){
        productTypeFacade.queryGoodsTypeByExample(goodsType);
        return "";
    }

    @RequestMapping(value = "queryById/{id}",method = RequestMethod.GET)
    public String queryById(@PathVariable Integer id){
        productTypeFacade.queryByPrimaryKey(id);
        return "";
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String queryAll(){
        productTypeFacade.queryList();
        return "";
    }
}
