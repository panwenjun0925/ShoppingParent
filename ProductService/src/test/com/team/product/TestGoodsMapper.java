package com.team.product;

import com.team.facade.pojo.Goods;
import com.team.facade.pojo.GoodsDes;
import com.team.facade.pojo.GoodsType;
import com.team.product.mapper.GoodsDesMapper;
import com.team.product.mapper.GoodsMapper;
import com.team.product.mapper.GoodsTypeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;


/**
 * @Auther: YouQi
 * @Date: 2018/11/22 10:38
 * @Description:
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
//只测试dao层
@MybatisTest
//取消虚拟数据源测试
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TestGoodsMapper {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    private GoodsDesMapper goodsDesMapper;

    @Test
    //默认更新操作会回滚
    @Rollback(false)
    public void testGoodsInsert(){
        Goods goods = new Goods(null, "开锁器", 12.0, "empty", 1, 10.0, 12.0, 14, 0, 9,
                10, "2018-09-01", "empty");
        Integer integer = goodsMapper.insertSelective(goods);
        System.out.println(integer);

    }

    @Test
    public void testGoodsDesQuery(){
        GoodsDes goodsDes = goodsDesMapper.queryByPrimaryKey(2);
        System.out.println(goodsDes);
    }

    @Test
    public void testGoodsTypeQuery(){
        GoodsType goodsType = new GoodsType(null,"弓",null,null,null);
        List<GoodsType> goodsTypes = goodsTypeMapper.queryGoodsTypeByExample(goodsType);
        for (GoodsType type : goodsTypes) {
            System.out.println(goodsTypes);
        }
    }

}
