package com.team.product.controller;

import com.team.product.service.ProductService;
import com.team.facade.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public @ResponseBody List<Goods> getList(){
        return productService.getList();
    }

    @RequestMapping(value = "insertGoods",method = RequestMethod.POST)
    public String insert(@RequestParam Goods goods){
          productService.insertSlective(goods);
        return "";
    }

    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public String deleteById(@PathVariable Integer id){
        productService.deleteByPrimaryKey(id);
        return "";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String updateById(Goods goods){
        productService.updateByPrimaryKeySelective(goods);
        return "";
    }

    @RequestMapping(value = "queryByExample",method = RequestMethod.POST)
    public String queryByExample(Goods example){
        productService.queryGoodsByExample(example);
        return "";
    }

    @RequestMapping(value = "queryun",method = RequestMethod.POST)
    public String queryUnPutaway(){
        productService.queryUnPutaway();
        return "";
    }



}
