package com.team.facade.IFacade;

import com.team.facade.pojo.Brand;
import com.team.facade.vo.BrandVo.BrandVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 19:41
 * @Description:
 * @Version: 1.0
 */
public interface IBrandFacade {
    /**
     * 功能描述:
     *
     * @param: [brand]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 11:19
     **/

    void  add(Brand brand);

    /**
     * 功能描述:
     *
     * @param: [brandVo]
     * @return: java.util.List<com.team.facade.pojo.Brand>
     * @auther: daixiao
     * @date: 2018/11/22 11:19
     **/

    List<Brand> findBy(BrandVo brandVo);

    /**
     * 功能描述:
     *
     * @param: [brand]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 11:22
     **/

    void delete(Brand brand);

    /**
     * 功能描述:
     *
     * @param: [brand]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 11:23
     **/

    void update(Brand brand);
}
