package com.team.producttype.service;

import com.team.facade.pojo.GoodsType;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/21 17:15
 * @Description:
 * @Version: 1.0
 */
public interface ProductTypeService {

    /**
     * 功能描述:查找所有商品详情
     *
     * @param: []
     * @return: java.util.List<com.team.facade.pojo.GoodsDes>
     * @auther: YouQi
     * @date: 2018/11/21 14:50
     **/
    List<GoodsType> queryList();

    /**
     * 功能描述:根据主键查找
     *
     * @param: [Id]
     * @return: com.team.facade.pojo.GoodsDes
     * @auther: YouQi
     * @date: 2018/11/21 10:53
     **/
    GoodsType queryByPrimaryKey(Integer Id);


    /**
     * 功能描述:根据传入的对象搜索 为null属性不成立
     *
     * @param: [goods]
     * @return: java.util.List<com.team.facade.pojo.GoodsDes>
     * @auther: YouQi
     * @date: 2018/11/21 10:49
     **/
    List<GoodsType> queryGoodsTypeByExample(GoodsType goods);


    /**
     * 功能描述:返回受影响的行数 属性为null不成立
     *
     * @param: [goods]
     * @return: java.lang.Integer
     * @auther: YouQi
     * @date: 2018/11/21 10:52
     **/
    Integer insertSelective(GoodsType goods);

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
    Integer updateByPrimaryKeySelective(GoodsType goods);

    /**
     * 功能描述:根据父类ID找类型
     *
     * @param: [id]
     * @return: java.util.List<com.team.facade.pojo.GoodsType>
     * @auther: YouQi
     * @date: 2018/11/27 11:27
     **/
    List<GoodsType> selectByParentId(Integer id);
}
