package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IProductTypeFacade;
import com.team.facade.pojo.GoodsType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 17:12
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("productType")
public class ProductTypeController {

    @Reference(timeout = 10000)
    private IProductTypeFacade productTypeFacade;

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insertProductDes(GoodsType goodsType){
        productTypeFacade.insertSelective(goodsType);
        return "redirect:productType/list";
    }

    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public String deleteProductDes( Integer id){
        productTypeFacade.deleteByPrimaryKey(id);
        return "redirect:productType/list";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String updateProductDes(GoodsType goodsType){
        productTypeFacade.updateByPrimaryKeySelective(goodsType);
        return "redirect:productType/list";
    }

    @RequestMapping(value = "queryByExample",method = RequestMethod.POST)
    public String queryByExample(GoodsType goodsType, Model model){
        List<GoodsType> goodsTypes = productTypeFacade.queryGoodsTypeByExample(goodsType);
        model.addAttribute("productTypeList",goodsType);

        return "redirect:productType/list";
    }

    @RequestMapping(value = "updateById",method = RequestMethod.GET)
    public String queryById(Integer id,Model model){
        GoodsType goodsType = productTypeFacade.queryByPrimaryKey(id);
        model.addAttribute("productType",goodsType);
        return "update_productType";
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String queryAll(Model model){
        List<GoodsType> goodsTypes = productTypeFacade.queryList();
        model.addAttribute("productTypeList",goodsTypes);
        return "productType_table";
    }
}
