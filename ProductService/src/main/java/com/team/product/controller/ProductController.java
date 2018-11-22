package com.team.product.controller;

import com.team.product.service.ProductService;
import com.team.facade.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @Auther: YouQi
 * @Date: 2018/11/21 10:32
 * @Description:
 * @Version: 1.0
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public @ResponseBody List<Goods> getList(){
        return productService.getList();
    }
}
