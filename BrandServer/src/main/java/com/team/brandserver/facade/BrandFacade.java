package com.team.brandserver.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.brandserver.service.BrandService;
import com.team.facade.IFacade.IBrandFacade;
import com.team.facade.pojo.Brand;
import com.team.facade.vo.BrandVo.BrandVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 20:29
 * @Description:
 * @Version: 1.0
 */
@Service
public class BrandFacade implements IBrandFacade {

    @Autowired
    BrandService brandService;

    @Override
    public void add(Brand brand) {
        brandService.add(brand);
    }

    @Override
    public List<Brand> findBy(BrandVo brandVo) {
        return brandService.findBy(brandVo);
    }

    @Override
    public void delete(Brand brand) {
        brandService.delete(brand);
    }

    @Override
    public void update(Brand brand) {
        brandService.update(brand);
    }
}
