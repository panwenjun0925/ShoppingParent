package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IProductDesFacade;
import com.team.facade.IFacade.IProductFacade;
import com.team.facade.pojo.Goods;
import com.team.facade.pojo.GoodsDes;
import com.team.facade.utils.ProductUtil;
import com.team.facade.vo.ProductVo.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 16:09
 * @Description:
 * @Version: 1.0
 */
@Controller

public class ProductDesController {

    @Reference
    private IProductDesFacade productDesFacade;

    @Reference
    private IProductFacade productFacade;

    @RequestMapping(value = "productDes/insert",method = RequestMethod.POST)
    public String insertProductDes(GoodsDes goodsDes){
        productDesFacade.insertSelective(goodsDes);
        return "redirect:/product/getList";
    }

    @RequestMapping(value = "productDes/delete",method = RequestMethod.GET)
    public String deleteProductDes( Integer id){
        productDesFacade.deleteByPrimaryKey(id);
        return "redirect:/product/getList";
    }

    @RequestMapping(value = "productDes/update",method = RequestMethod.POST)
    public String updateProductDes(GoodsDes goodsDes){
        productDesFacade.updateByPrimaryKeySelective(goodsDes);
        return "redirect:/product/getList";
    }

    @RequestMapping(value = "productDes/queryByExample",method = RequestMethod.POST)
    public String queryByExample(GoodsDes goodsDes,Model model){
        List<GoodsDes> list = productDesFacade.queryGoodsDesByExample(goodsDes);
        model.addAttribute("productDesList",list);
        return "redirect:/productDes/list";
    }

    @RequestMapping(value = "productDes/updateById",method = RequestMethod.GET)
    public String queryById(Integer id,Model model){
        GoodsDes goodsDes = productDesFacade.queryByPrimaryKey(id);
        model.addAttribute("productDes",goodsDes);
        return "update_productDes";
    }

    @RequestMapping(value = "productDes/list",method = RequestMethod.GET)
    public String queryAll(Model model){
        List<ProductDTO> productDetailList = productDesFacade.getProductDetail();
        model.addAttribute("productDTOList",productDetailList);
        return "productDes_table";
    }

    @RequestMapping(value = "productDes/getDefiniteProduct/{productDesId}",method = RequestMethod.POST)
    public @ResponseBody ProductDTO getDefiniteProductInfo(@PathVariable Integer productDesId){

        GoodsDes productDes = productDesFacade.queryByPrimaryKey(productDesId);
        Goods goods = productFacade.queryByPrimaryKey(productDes.getGoodsId());
        ProductDTO productDTO = ProductUtil.packageProductDTO(goods, productDes);
        return productDTO;

    }


}
