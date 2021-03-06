package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IProductTypeFacade;
import com.team.facade.pojo.GoodsType;
import com.team.web.utils.FastDFSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 17:12
 * @Description:
 * @Version: 1.0
 */
@Controller

public class ProductTypeController {

    @Reference(timeout = 10000)
    private IProductTypeFacade productTypeFacade;
    @Autowired
    private  FastDFSUtils fastDFSUtils;

    @RequestMapping(value = "productType/insert",method = RequestMethod.POST)
    public String insertProductDes(GoodsType goodsType ,MultipartFile TypePictures){
        try {
            String s = fastDFSUtils.uploadFile(TypePictures);
            goodsType.setTypePicture(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        productTypeFacade.insertSelective(goodsType);
        return "redirect:/productType/list";
    }

    @RequestMapping(value = "productType/delete",method = RequestMethod.GET)
    public String deleteProductDes( Integer id){
        productTypeFacade.deleteByPrimaryKey(id);
        return "redirect:/productType/list";
    }

    @RequestMapping(value = "productType/update",method = RequestMethod.POST)
    public String updateProductDes(GoodsType goodsType,MultipartFile TypePictures) throws IOException {
        String s = fastDFSUtils.uploadFile(TypePictures);
        goodsType.setTypePicture(s);
        productTypeFacade.updateByPrimaryKeySelective(goodsType);
        return "redirect:/productType/list";
    }

    @RequestMapping(value = "productType/queryByExample",method = RequestMethod.POST)
    public String queryByExample(GoodsType goodsType, Model model){
        List<GoodsType> goodsTypes = productTypeFacade.queryGoodsTypeByExample(goodsType);
        model.addAttribute("productTypeList",goodsType);

        return "redirect:/productType/list";
    }

    @RequestMapping(value = "productType/jumpUpdateById",method = RequestMethod.GET)
    public String queryById(Integer id,Model model){
        GoodsType goodsType = productTypeFacade.queryByPrimaryKey(id);
        model.addAttribute("productType",goodsType);
        return "update_productType";
    }

    @RequestMapping(value = "productType/list",method = RequestMethod.GET)
    public String queryAll(Model model){
        List<GoodsType> goodsTypes = productTypeFacade.queryList();
        model.addAttribute("productTypeList",goodsTypes);
        return "productType_table";
    }

    @RequestMapping(value = "productType/initInsertType",method = RequestMethod.GET)
    public String initInsert(Model model){
        GoodsType goodsType = new GoodsType();
        goodsType.setTypeParentId(1);
        List<GoodsType> goodsTypes = productTypeFacade.queryGoodsTypeByExample(goodsType);
        model.addAttribute("typeOne",goodsTypes);
        return  "productType_add";
    }

    @RequestMapping(value = "productType/getProductType",method = RequestMethod.POST)
    public @ResponseBody  List<GoodsType> getAllType(){
        List<GoodsType> goodsTypes = productTypeFacade.queryList();
        return goodsTypes;
    }

}
