package com.team.brandserver.service;

import com.team.brandserver.vo.BrandVo;
import com.team.facade.pojo.Brand;

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
