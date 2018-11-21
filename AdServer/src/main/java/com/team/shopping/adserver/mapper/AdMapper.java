package com.team.shopping.adserver.mapper;

import com.team.facade.pojo.Ad;
import com.team.shopping.adserver.vo.AdVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 10:53
 * @Description:
 * @Version: 1.0
 */
public interface AdMapper {
    /**
     * 功能描述:添加广告
     *
     * @param: [ad]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/21 11:08
     **/

      void add(Ad ad);

      /**
       * 功能描述: 查询
       *
       * @param: [adVo]
       * @return: java.util.List<com.team.facade.pojo.Ad>
       * @auther: daixiao
       * @date: 2018/11/21 11:27
       **/

      List<Ad> findBy(AdVo adVo);

      /**
       * 功能描述:删除
       *
       * @param: [ad]
       * @return: void
       * @auther: daixiao
       * @date: 2018/11/21 11:28
       **/

      void delete(Ad ad);

      /**
       * 功能描述:修改
       *
       * @param: [ad]
       * @return: void
       * @auther: daixiao
       * @date: 2018/11/21 11:29
       **/

      void update(Ad ad);
}
