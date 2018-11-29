package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IBrandFacade;
import com.team.facade.pojo.Brand;
import com.team.facade.vo.BrandVo.BrandVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/23 10:55
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private IBrandFacade brandFacade;

    @RequestMapping("/list")
    public String getAll(BrandVo brandVo, Model model){
        List<Brand> adminList = brandFacade.findBy(brandVo);
        model.addAttribute("admins",adminList);
        return  "brand_list";
    }

    @RequestMapping("/add")
    public String addAd(Brand brand){
        brandFacade.add(brand);
        return "a";
    }

    @RequestMapping("/delete")
    public String deleteAd(Brand brand){
        brandFacade.delete(brand);
        return "";
    }

    @RequestMapping("/update")
    public String updateAd(Brand brand){
        brandFacade.update(brand);
        return  "";
    }
}
