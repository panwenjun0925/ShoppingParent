package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.team.facade.IFacade.IAdFacade;
import com.team.facade.pojo.Ad;
import com.team.facade.vo.AdVo.AdVo;
import com.team.facade.vo.AdVo.ConstomAd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/23 10:55
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/ad")
public class AdController {

    @Reference
    private IAdFacade adFacade;

    @Resource
    private FastFileStorageClient storageClient;

    @RequestMapping("/list")
    public String getAll(AdVo adVo, Model model){
        List<Ad> adList = adFacade.findAll(adVo);
        model.addAttribute("ads",adList);
        return  "ad_list";
    }

    @RequestMapping("/add")
    public String addAd(Ad ad, MultipartFile file) throws Exception{
            if(!file.isEmpty()){
                StorePath storePath = storageClient.uploadFile(null, file.getInputStream(), file.getSize(), "jpg");
                String path = "http://119.23.236.201:8888/"+storePath.getGroup()+"/"+storePath.getPath();
                ad.setAdPicture(path);
            }
        adFacade.add(ad);
        return "redirect:/ad/list";
    }

    @RequestMapping("/delete/{id}")
    public String deleteAd(@PathVariable(name = "id") Integer id){
        adFacade.deleteAd(id);
        return "redirect:/ad/list";
    }

    @RequestMapping("/findById/{id}")
    public  String findById(@PathVariable(name = "id") Integer id, Model model){
        ConstomAd constomAd = new ConstomAd();
        constomAd.setAdId(id);
        AdVo adVo = new AdVo();
        adVo.setConstomAd(constomAd);
        List<Ad> adList = adFacade.findAll(adVo);
        model.addAttribute("ad",adList.get(0));
        return "ad_showUpdate";
    }

    @RequestMapping("/update")
    public String updateAd(Ad ad,MultipartFile file) throws Exception{
        if(!file.isEmpty()){
            StorePath storePath = storageClient.uploadFile(null, file.getInputStream(), file.getSize(), "jpg");
            String path = "http://119.23.236.201:8888/"+storePath.getGroup()+"/"+storePath.getPath();
            ad.setAdPicture(path);
        }
        System.out.println(ad);
        adFacade.updateAd(ad);
        return  "redirect:/ad/list";
    }

    @RequestMapping("/findBy")
    public  String findBy(ConstomAd constomAd,Model model){
        System.out.println(constomAd.getAdDes());
        AdVo adVo = new AdVo();
        adVo.setConstomAd(constomAd);
        List<Ad> list = adFacade.findAll(adVo);
        System.out.println(list);
        model.addAttribute("ads",list);
        return "ad_list";
    }
}
