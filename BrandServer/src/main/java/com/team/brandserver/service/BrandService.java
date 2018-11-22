package com.team.brandserver.service;

import com.team.facade.pojo.Brand;
import com.team.facade.vo.BrandVo.BrandVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 11:15
 * @Description:
 * @Version: 1.0
 */
public interface BrandService {

    void  add(Brand brand);

    List<Brand> findBy(BrandVo brandVo);

    void delete(Brand brand);

    void update(Brand brand);
}
