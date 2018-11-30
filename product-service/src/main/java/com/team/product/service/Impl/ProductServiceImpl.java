package com.team.product.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.facade.pojo.Goods;
import com.team.product.mapper.GoodsMapper;
import com.team.product.service.ProductService;
import com.team.product.utils.AttrUtil;
import com.team.product.utils.TimeFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/20 19:01
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public PageInfo<Goods> getList(Integer pageNum) {

        PageHelper.startPage(pageNum,3);
        List<Goods> goods = goodsMapper.queryList();
        PageInfo<Goods> pageInfo = new PageInfo<>(goods);


        return pageInfo;
    }

    @Override
    public Integer insertSlective(Goods goods) {

        goods.setGoodsShelfTime(TimeFormatUtil.formatTime(new Date()));
        goods.setGoodsDiscount(goods.getGoodsRealPrice()/goods.getGoodsShowPrice());
        goods.setGoodsSaleNum(0);
        String goodsAttr = goods.getGoodsAttr();
        if (goodsAttr!=null&&goodsAttr!=null){
            String s = AttrUtil.attrToJsonString(goodsAttr);
            goods.setGoodsAttr(s);
        }
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public List<Goods> queryGoodsByExample(Goods goods) {
        return goodsMapper.queryGoodsByExample(goods);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKeySelective(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public List<Goods> queryUnPutaway() {
        return goodsMapper.queryUnPutaway();
    }

    @Override
    public Goods queryByPrimaryKey(Integer id) {
        return goodsMapper.queryByPrimaryKey(id);
    }
}
