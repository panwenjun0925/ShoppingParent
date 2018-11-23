package com.team.product.controller;

import com.team.product.service.ProductDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 16:09
 * @Description:
 * @Version: 1.0
 */
@Controller
public class ProductDesController {

    @Autowired
    private ProductDesService productDesService;

}
