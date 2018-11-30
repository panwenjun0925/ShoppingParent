package com.team.newsserver.service;

import com.team.facade.pojo.News;
import com.team.facade.vo.NewsVo.NewsVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 12:11
 * @Description:
 * @Version: 1.0
 */
public interface NewsService {

    void  add(News news);

    List<News> findBy(NewsVo newsVo);

    void delete(Integer id);

    void  update(News news);
}
