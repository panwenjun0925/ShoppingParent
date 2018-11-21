package com.team.shopping.adserver.service;

import com.team.facade.pojo.Ad;
import com.team.shopping.adserver.vo.AdVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 11:31
 * @Description:
 * @Version: 1.0
 */
public interface AdService {

    void add(Ad ad);

    List<Ad> findAll(AdVo adVo);

    Ad findById(AdVo adVo);

    void deleteAd(Ad ad);

    void  updateAd(Ad ad);
}
