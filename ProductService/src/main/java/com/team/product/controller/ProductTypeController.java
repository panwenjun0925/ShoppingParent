package com.team.product.controller;

import com.team.product.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 17:12
 * @Description:
 * @Version: 1.0
 */
@Controller
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;
}
