package com.team.adserver.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.adserver.service.AdService;
import com.team.facade.IFacade.IAdFacade;
import com.team.facade.pojo.Ad;
import com.team.facade.vo.AdVo.AdVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 17:16
 * @Description:
 * @Version: 1.0
 */
@Service
public class AdFacade implements IAdFacade {

    @Autowired
    AdService adService;

    @Override
    public void add(Ad ad) {
        adService.add(ad);
    }

    @Override
    public List<Ad> findAll(AdVo adVo) {
        return adService.findAll(adVo);
    }


    @Override
    public void deleteAd(Integer id) {
        adService.deleteAd(id);
    }

    @Override
    public void updateAd(Ad ad) {
        System.out.println("service");
            adService.updateAd(ad);
    }
}
