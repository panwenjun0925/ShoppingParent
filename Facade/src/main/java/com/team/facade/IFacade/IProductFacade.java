package com.team.facade.IFacade;

import com.github.pagehelper.PageInfo;
import com.team.facade.pojo.Goods;

import java.util.List;
import java.util.Map;

/**
 * @Auther: YouQi
 * @Date: 2018/11/22 12:29
 * @Description:
 * @Version: 1.0
 */
public interface IProductFacade {
    PageInfo<Goods> getList(Integer pageNum);

    Integer insertSlective(Goods goods);

    /**
     * 功能描述:根据传入的对象搜索 为null属性不成立
     *
     * @param: [goods]
     * @return: java.util.List<com.team.facade.pojo.Goods>
     * @auther: YouQi
     * @date: 2018/11/21 10:49
     **/
    List<Goods> queryGoodsByExample(Goods goods);

    /**
     * 功能描述:根据主键删除
     *
     * @param: [id]
     * @return: java.lang.Integer
     * @auther: YouQi
     * @date: 2018/11/21 10:54
     **/
    Integer deleteByPrimaryKey(Integer id);

    /**
     * 功能描述:选择性更新 属性为null不成立
     *
     * @param: [goods]
     * @return: java.lang.Integer
     * @auther: YouQi
     * @date: 2018/11/21 10:56
     **/
    Integer updateByPrimaryKeySelective(Goods goods);

    /**
     * 功能描述:查询所有的已下架商品
     *
     * @param: []
     * @return: java.util.List<com.team.facade.pojo.Goods>
     * @auther: YouQi
     * @date: 2018/11/21 14:01
     **/
    List<Goods> queryUnPutaway();

    Goods queryByPrimaryKey(Integer id);

    List<Goods> queryAll();
}
