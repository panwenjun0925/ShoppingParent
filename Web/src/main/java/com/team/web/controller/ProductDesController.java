package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IProductDesFacade;
import com.team.facade.IFacade.IProductFacade;
import com.team.facade.pojo.GoodsDes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 16:09
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("productDes")
public class ProductDesController {

    @Reference
    private IProductDesFacade productDesFacade;

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insertProductDes(GoodsDes goodsDes){
        productDesFacade.insertSelective(goodsDes);
        return "";
    }

    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public String deleteProductDes(@PathVariable Integer id){
        productDesFacade.deleteByPrimaryKey(id);
        return "";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String updateProductDes(GoodsDes goodsDes){
        productDesFacade.updateByPrimaryKeySelective(goodsDes);
        return "";
    }

    @RequestMapping(value = "queryByExample",method = RequestMethod.POST)
    public String queryByExample(GoodsDes goodsDes){
        productDesFacade.queryGoodsDesByExample(goodsDes);
        return "";
    }

    @RequestMapping(value = "queryById/{id}",method = RequestMethod.GET)
    public String queryById(@PathVariable Integer id){
        productDesFacade.queryByPrimaryKey(id);
        return "";
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String queryAll(){
        productDesFacade.queryList();
        return "";
    }


}
