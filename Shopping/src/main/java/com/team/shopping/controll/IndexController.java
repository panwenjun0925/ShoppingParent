package com.team.shopping.controll;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.IAdFacade;
import com.team.facade.IFacade.INewsFacade;
import com.team.facade.IFacade.IProductTypeFacade;
import com.team.facade.pojo.Ad;
import com.team.facade.pojo.GoodsType;
import com.team.facade.pojo.News;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping("/index")
public class IndexController {

    @Reference
    private IProductTypeFacade productTypeFacade;
    @Reference
    private IAdFacade AdFacade;
    @Reference(timeout = 10000)
    private INewsFacade newsFacade;

    @RequestMapping(value = "/getNews",method = RequestMethod.POST)
    public @ResponseBody List<News> initPram(){
        List<News> by = newsFacade.findBy(null);
        return by;
    }

    @RequestMapping(value = "/getADs",method = RequestMethod.POST)
    public @ResponseBody List<Ad> getADs(){
        List<Ad> all = AdFacade.findAll(null);
        return all;
    }

    @RequestMapping(value = "/getProductType",method = RequestMethod.POST)
    public @ResponseBody Map<String,List<GoodsType>> getProductType(){

        HashMap<String, List<GoodsType>> goodsTypeMap=new HashMap<>();
        List<GoodsType> goodsTypes = productTypeFacade.selectByParentId(1);
        for (GoodsType parentType : goodsTypes) {
            List<GoodsType> sonList = productTypeFacade.selectByParentId(parentType.getTypeId());
            goodsTypeMap.put(parentType.getTypeName(),sonList);
        }
        return goodsTypeMap;
    }
}
