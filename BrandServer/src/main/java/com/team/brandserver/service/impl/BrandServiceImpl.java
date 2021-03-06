package com.team.brandserver.service.impl;

import com.team.brandserver.mapper.BrandMapper;
import com.team.brandserver.service.BrandService;
import com.team.facade.pojo.Brand;
import com.team.facade.vo.BrandVo.BrandVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 11:16
 * @Description:
 * @Version: 1.0
 */
@Component
public class BrandServiceImpl implements BrandService{

    @Autowired
    BrandMapper brandMapper;

    @Override
    public void add(Brand brand) {
        brandMapper.add(brand);
    }

    @Override
    public List<Brand> findBy(BrandVo brandVo) {
        return brandMapper.findBy(brandVo);
    }

    @Override
    public void delete(Integer id) {
        brandMapper.delete(id);
    }

    @Override
    public void update(Brand brand) {
        brandMapper.update(brand);
    }
}
