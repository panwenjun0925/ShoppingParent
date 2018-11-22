package com.team.web.controller;

import com.team.facade.IFacade.IProductFacade;
import com.team.facade.pojo.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Auther: YouQi
 * @Date: 2018/11/21 10:32
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("product")
public class ProductController {

    private IProductFacade productFacade;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Goods> getList() {
        return productFacade.getList();
    }

    @RequestMapping(value = "insertGoods", method = RequestMethod.POST)
    public String insert(@RequestParam Goods goods) {
        productFacade.insertSlective(goods);
        return "";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deleteById(@PathVariable Integer id) {
        productFacade.deleteByPrimaryKey(id);
        return "";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String updateById(Goods goods) {
        productFacade.updateByPrimaryKeySelective(goods);
        return "";
    }

    @RequestMapping(value = "queryByExample", method = RequestMethod.POST)
    public String queryByExample(Goods example) {
        productFacade.queryGoodsByExample(example);
        return "";
    }

    @RequestMapping(value = "queryun", method = RequestMethod.POST)
    public String queryUnPutaway() {
        productFacade.queryUnPutaway();
        return "";
    }


}
