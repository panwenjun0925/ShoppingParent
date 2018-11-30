package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.facade.IFacade.INewsFacade;
import com.team.facade.pojo.News;
import com.team.facade.vo.NewsVo.NewsVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/23 10:55
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/news")
public class NewsController {

    @Reference
    private INewsFacade newsFacade;

    @RequestMapping("/list")
    public String getAll(NewsVo newsVo, Model model){
        List<News> newsList = newsFacade.findBy(newsVo);
        model.addAttribute("news",newsList);
        return  "news_list";
    }

    @RequestMapping("/add")
    public String addAd(News news){
        newsFacade.add(news);
        return "";
    }

    @RequestMapping("/delete/{id}")
    public String deleteAd(@PathVariable(name = "id") Integer id){
        newsFacade.delete(id);
        return "";
    }

    @RequestMapping("/update")
    public String updateAd(News news){
        newsFacade.update(news);
        return  "";
    }
}
