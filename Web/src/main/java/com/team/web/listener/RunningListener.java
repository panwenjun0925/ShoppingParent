package com.team.web.listener;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;

import com.team.facade.IFacade.*;
import com.team.facade.pojo.Goods;
import com.team.facade.pojo.GoodsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/12/4 15:26
 * @Description:
 * @Version: 1.0
 */
@Component
public class RunningListener  implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Reference
    INewsFacade newsFacade;
    @Reference
    IAdFacade adFacade;
    @Reference
    IAddressFacade addressFacade;
    @Reference
    IProductTypeFacade productTypeFacade;
    @Reference
    IProductFacade productFacade;
    @Reference
    IProductDesFacade productDesFacade;
    @Reference
    IAdminFacade adminFacade;
    @Reference
    IBrandFacade brandFacade;
    @Reference
    IOrderFacade orderFacade;
    @Reference
    IUserFacade userFacade;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        //商品
//        List<Goods> goods = productFacade.queryAll();
//        String s = JSON.toJSONString(goods);
//        redisTemplate.opsForValue().set("products",s);

        //商品分类
        HashMap<String, List<GoodsType>> goodsTypeMap=new HashMap<>();
        List<GoodsType> goodsTypes = productTypeFacade.selectByParentId(1);
        for (GoodsType parentType : goodsTypes) {
            List<GoodsType> sonList = productTypeFacade.selectByParentId(parentType.getTypeId());
            goodsTypeMap.put(parentType.getTypeName(),sonList);
            goodsTypeMap.put("firstType",goodsTypes);
        }
        String typeString = JSON.toJSONString(goodsTypeMap);
        //传入redis
        redisTemplate.opsForValue().set("productTypeMap",typeString);
//        Object productTypeMap = redisTemplate.opsForValue().get("productTypeMap");
//        System.out.println(productTypeMap.toString());

    }
}
