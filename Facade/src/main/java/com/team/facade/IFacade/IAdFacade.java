package com.team.facade.IFacade;

import com.team.facade.pojo.Ad;
import com.team.facade.vo.AdVo.AdVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 17:15
 * @Description:
 * @Version: 1.0
 */
public interface IAdFacade {

    /**
     * 功能描述: 增加广告
     *
     * @param: [ad]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 19:28
     **/

    void add(Ad ad);

    /**
     * 功能描述:查询所有
     *
     * @param: [adVo]
     * @return: java.util.List<com.team.facade.pojo.Ad>
     * @auther: daixiao
     * @date: 2018/11/22 19:28
     **/

    List<Ad> findAll(AdVo adVo);

    /**
     * 功能描述:通过id进行删除
     *
     * @param: [ad]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 19:28
     **/

    void deleteAd(Ad ad);

    /**
     * 功能描述:修改广告
     *
     * @param: [ad]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 19:29
     **/

    void  updateAd(Ad ad);
}
