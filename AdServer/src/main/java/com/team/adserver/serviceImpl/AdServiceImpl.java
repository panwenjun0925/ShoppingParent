package com.team.adserver.serviceImpl;

import com.team.adserver.mapper.AdMapper;
import com.team.adserver.vo.AdVo;
import com.team.facade.pojo.Ad;
import com.team.adserver.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 11:36
 * @Description:
 * @Version: 1.0
 */
@Service
public class AdServiceImpl implements AdService {

    @Autowired
    AdMapper adMapper;

    @Override
    public void add(Ad ad) {
        adMapper.add(ad);
    }

    @Override
    public List<Ad> findAll(AdVo adVo) {
        return adMapper.findBy(adVo);
    }

    @Override
    public Ad findById(AdVo adVo) {
        List<Ad> adList = adMapper.findBy(adVo);
        return adList.get(0);
    }

    @Override
    public void deleteAd(Ad ad) {
        adMapper.delete(ad);
    }

    @Override
    public void updateAd(Ad ad) {

    }
}
