package com.team.shopping.adserver.serviceImpl;

import com.team.facade.pojo.Ad;
import com.team.shopping.adserver.mapper.AdMapper;
import com.team.shopping.adserver.service.AdService;
import com.team.shopping.adserver.vo.AdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 11:36
 * @Description:
 * @Version: 1.0
 */
@Service
@Transactional
public class AdServiceImpl implements AdService {

    @Autowired
    AdMapper adMapper;

    @Override
    public void add(Ad ad) {
        adMapper.add(ad);
    }

    @Transactional(readOnly = true)
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
