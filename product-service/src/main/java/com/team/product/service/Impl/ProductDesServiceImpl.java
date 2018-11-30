package com.team.product.service.Impl;

import com.team.facade.pojo.Goods;
import com.team.facade.utils.ProductUtil;
import com.team.facade.vo.ProductVo.ProductDTO;
import com.team.product.mapper.GoodsDesMapper;
import com.team.facade.pojo.GoodsDes;
import com.team.product.mapper.GoodsMapper;
import com.team.product.service.ProductDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 16:16
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProductDesServiceImpl implements ProductDesService {

    @Autowired
    private GoodsDesMapper goodsDesMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsDes> queryList() {
        return goodsDesMapper.queryList();
    }

    @Override
    public GoodsDes queryByPrimaryKey(Integer Id) {
        return goodsDesMapper.queryByPrimaryKey(Id);
    }

    @Override
    public List<GoodsDes> queryGoodsDesByExample(GoodsDes goods) {
        return goodsDesMapper.queryGoodsDesByExample(goods);
    }

    @Override
    public Integer insertSelective(GoodsDes goods) {
        String goodsShowPicture = goodsMapper.queryByPrimaryKey(goods.getGoodsId()).getGoodsShowPicture();
        if (goodsShowPicture!=null&&goodsShowPicture!=""){
            String[] split = goodsShowPicture.split("#");
            goods.setGoodsDesPicture(split[0]);
        }

        return goodsDesMapper.insertSelective(goods);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return goodsDesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKeySelective(GoodsDes goods) {
        return goodsDesMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public List<ProductDTO> getProductDetail() {
        List<GoodsDes> goodsDesList = goodsDesMapper.queryList();
        List<ProductDTO> productDTOList=new ArrayList<>();
        if (goodsDesList.size()>0) {
            for (GoodsDes goodsDes : goodsDesList) {
                Goods goods = goodsMapper.queryByPrimaryKey(goodsDes.getGoodsId());
                ProductDTO productDTO = ProductUtil.packageProductDTO(goods, goodsDes);
                productDTOList.add(productDTO);
            }

        }
        return productDTOList;
    }
}
