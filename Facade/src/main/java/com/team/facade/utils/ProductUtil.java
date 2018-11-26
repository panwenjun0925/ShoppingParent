package com.team.facade.utils;

import com.team.facade.pojo.Goods;
import com.team.facade.pojo.GoodsDes;
import com.team.facade.vo.ProductVo.ProductDTO;

/**
 * @Auther: YouQi
 * @Date: 2018/11/26 20:39
 * @Description:
 * @Version: 1.0
 */
public class ProductUtil {

    public static ProductDTO packageProductDTO(Goods goods, GoodsDes goodsDes){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setDefiniteAttr(goodsDes.getGoodsAttr());
        productDTO.setGoodsCount(goodsDes.getGoodsCount());
        productDTO.setGoodsDesId(goodsDes.getGoodsDesId());
        productDTO.setGoodsDesPicture(goodsDes.getGoodsDesPicture());
        productDTO.setGoodsWeight(goodsDes.getGoodsWeight());
        productDTO.setBrandId(goods.getBrandId());
        productDTO.setGoodsId(goods.getGoodsId());
        productDTO.setGoodsName(goods.getGoodsName());
        productDTO.setGoodsRealPrice(goods.getGoodsRealPrice());
        productDTO.setGoodsTypeId(goods.getGoodsTypeId());
        productDTO.setGoodsShelfTime(goods.getGoodsShelfTime());

        return productDTO;
    }
}
