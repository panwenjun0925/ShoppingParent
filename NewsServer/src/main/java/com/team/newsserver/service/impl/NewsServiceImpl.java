package com.team.newsserver.service.impl;

import com.team.facade.pojo.News;
import com.team.facade.vo.NewsVo.NewsVo;
import com.team.newsserver.mapper.NewsMapper;
import com.team.newsserver.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 12:13
 * @Description:
 * @Version: 1.0
 */
@Component
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsMapper newsMapper;

    @Override
    public void add(News news) {
    newsMapper.add(news);
    }

    @Override
    public List<News> findBy(NewsVo newsVo) {
        return newsMapper.findBy(newsVo);
    }


    @Override
    public void delete(News news) {
    newsMapper.delete(news.getNewsId());
    }

    @Override
    public void update(News news) {
        newsMapper.update(news);
    }
}
