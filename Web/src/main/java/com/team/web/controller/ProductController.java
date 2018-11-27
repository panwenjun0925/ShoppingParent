package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.facade.IFacade.IProductFacade;
import com.team.facade.pojo.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * @Auther: YouQi
 * @Date: 2018/11/21 10:32
 * @Description:
 * @Version: 1.0
 */
@Controller
public class ProductController {

    @Reference(timeout = 10000)
    private IProductFacade productFacade;

    @RequestMapping(value = "product/getList", method = RequestMethod.GET)
    public String getList(Model model,@RequestParam Integer pageNum) {
        PageHelper.startPage(pageNum,3);
        List<Goods> list = productFacade.getList();
        PageInfo<Goods> goodsPageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo",goodsPageInfo);
        model.addAttribute("productList", list);
        return "product_table";
    }

    @RequestMapping(value = "product/insertGoods", method = RequestMethod.POST)
    public String insert(@RequestParam Goods goods) {
        productFacade.insertSlective(goods);
        return "redirect:product/getList";
    }

    @RequestMapping(value = "product/delete", method = RequestMethod.GET)
    public String deleteById( Integer id) {

        productFacade.deleteByPrimaryKey(id);
        return "redirect:product/getList";
    }

    @RequestMapping(value = "product/update", method = RequestMethod.POST)
    public String updateById(Goods goods) {
        productFacade.updateByPrimaryKeySelective(goods);
        return "redirect:product/getList";
    }

    @RequestMapping(value = "product/queryByExample", method = RequestMethod.POST)
    public String queryByExample(Goods example,Model model) {
        List<Goods> goods = productFacade.queryGoodsByExample(example);
        model.addAttribute("product",goods);
        return "redirect:product/getList";
    }

    @RequestMapping(value = "product/getUnPutList", method = RequestMethod.GET)
    public String queryUnPutaway(Model model) {
        List<Goods> goods = productFacade.queryUnPutaway();
        model.addAttribute("productList", goods);
        return "redirect:product/getList";
    }

    @RequestMapping(value = "product/jumpUpdateById", method = RequestMethod.GET)
    public String showUpdate(Integer id, Model model) {
        Goods goods = productFacade.queryByPrimaryKey(id);
        model.addAttribute("product", goods);
        return "update_product";
    }


}
