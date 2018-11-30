package com.team.newsserver.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.facade.IFacade.INewsFacade;
import com.team.facade.pojo.News;
import com.team.facade.vo.NewsVo.NewsVo;
import com.team.newsserver.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 19:44
 * @Description:
 * @Version: 1.0
 */
@Service
public class NewsFacade implements INewsFacade {

    @Autowired
    NewsService newsService;

    @Override
    public void add(News news) {
        newsService.add(news);
    }

    @Override
    public List<News> findBy(NewsVo newsVo) {
        return newsService.findBy(newsVo);
    }

    @Override
    public void delete(Integer id) {
        newsService.delete(id);
    }

    @Override
    public void update(News news) {
        newsService.update(news);
    }
}
