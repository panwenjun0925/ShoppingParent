package com.team.shopping.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IAdFacade;
import com.team.facade.IFacade.INewsFacade;
import com.team.facade.IFacade.IProductTypeFacade;
import com.team.facade.pojo.GoodsType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: YouQi
 * @Date: 2018/11/29 19:41
 * @Description:
 * @Version: 1.0
 */
@Controller
public class IndexController {

    @Reference
    private IProductTypeFacade productTypeFacade;
    @Reference
    private IAdFacade AdFacade;
    @Reference
    private INewsFacade newsFacade;

    @RequestMapping("index/initPram")
    public @ResponseBody Map<String, List<GoodsType>> getProductType(){
        List<GoodsType> goodsTypes = productTypeFacade.selectByParentId(1);

        HashMap<String, List<GoodsType>> typeMap = new HashMap<>();

        for (GoodsType parentType : goodsTypes) {
            List<GoodsType> sonList = productTypeFacade.selectByParentId(parentType.getTypeId());
            typeMap.put(parentType.getTypeName(),sonList);
        }



        return typeMap;
    }
}
