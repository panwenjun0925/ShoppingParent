package com.team.product.test;

import com.team.facade.pojo.Goods;
import com.team.product.TestAppStart;
import com.team.product.mapper.GoodsMapper;
import com.unitils.boot.util.UnitilsBootBlockJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.unitils.database.annotations.Transactional;
import org.unitils.database.util.TransactionMode;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBeanByType;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 23:41
 * @Description:
 * @Version: 1.0
 */
@RunWith(UnitilsBootBlockJUnit4ClassRunner.class)
@SpringBootTest(classes = TestAppStart.class)
@Transactional(value = TransactionMode.ROLLBACK)
public class TestGoodsMapperByDBunit {

    @SpringBeanByType
    private GoodsMapper goodsMapper;


    @Test
    @DataSet({"testData.xml"})
    public void TestUpdate() {
        List<Goods> goods = goodsMapper.queryList();
        Assert.assertTrue(goods.get(1).getGoodsName().equals("杜松果"));
    }


}
