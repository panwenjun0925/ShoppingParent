package com.team.product;

import com.team.facade.pojo.Goods;
import com.team.product.mapper.GoodsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


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

    @Test
    //默认更新操作会回滚
    @Rollback
    public void update(){
        Goods goods = new Goods(null, "恶魔剑", 900.0, "empty", 1, 10.0, 900.0, 4, 0, 9,
                9, "2018-09-01", "empty");
        Integer integer = goodsMapper.updateByPrimaryKeySelective(goods);
        System.out.println(integer);


    }
}
