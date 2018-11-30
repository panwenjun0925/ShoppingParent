package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.team.facade.IFacade.IBrandFacade;
import com.team.facade.pojo.Brand;
import com.team.facade.vo.BrandVo.BrandVo;
import com.team.facade.vo.BrandVo.ConstomBrand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
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
    @Resource
    private FastFileStorageClient storageClient;


    @RequestMapping("/list")
    public String getAll(BrandVo brandVo, Model model){
        List<Brand> brandList = brandFacade.findBy(brandVo);
        model.addAttribute("brands",brandList);
        return  "brand/brand_list";
    }
    /**
     * 功能描述:添加
     *
     * @param: [brand, file]
     * @return: java.lang.String
     * @auther: daixiao
     * @date: 2018/11/29 14:42
     **/

    @RequestMapping("/add")
    public String addAd(Brand brand, MultipartFile file) throws Exception{
        if(!file.isEmpty()){
            StorePath storePath = storageClient.uploadFile(null, file.getInputStream(), file.getSize(), "jpg");
            String path = "http://119.23.236.201:8888/"+storePath.getGroup()+"/"+storePath.getPath();
            brand.setBrandLog(path);
        }
        brandFacade.add(brand);
        return "redirect:/brand/list";
    }

    @RequestMapping("/delete/{id}")
    public String deleteAd(@PathVariable(name = "id") Integer id){
        brandFacade.delete(id);
        return "redirect:/brand/list";
    }

    @RequestMapping("/findById/{id}")
    public  String findById(@PathVariable(name = "id") Integer id, Model model){
        ConstomBrand constomBrand = new ConstomBrand();
        constomBrand.setBrandId(id);
        BrandVo brandVo = new BrandVo();
        brandVo.setConstomBrand(constomBrand);
        List<Brand> list = brandFacade.findBy(brandVo);
        model.addAttribute("brand",list.get(0));
        return "brand/brand_showUpdate";
    }

    @RequestMapping("/update")
    public String updateAd(Brand brand,Model model){
        brandFacade.update(brand);
        ConstomBrand constomBrand = new ConstomBrand();
        constomBrand.setBrandId(brand.getBrandId());
        BrandVo brandVo = new BrandVo();
        brandVo.setConstomBrand(constomBrand);
        List<Brand> list = brandFacade.findBy(brandVo);
        model.addAttribute("brands",list.get(0));
        return  "brand/brand_list";
    }

    @RequestMapping("/findBy")
    public String findBy(ConstomBrand constomBrand,Model model){
        BrandVo brandVo = new BrandVo();
        brandVo.setConstomBrand(constomBrand);
        List<Brand> list = brandFacade.findBy(brandVo);
        model.addAttribute("brands",list);
        return "brand/brand_list";
    }
}
