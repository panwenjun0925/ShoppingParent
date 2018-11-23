package com.team.facade.IFacade;

import com.team.facade.pojo.News;
import com.team.facade.vo.NewsVo.NewsVo;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 19:42
 * @Description:
 * @Version: 1.0
 */
public interface INewsFacade {
    /**
     * 功能描述:
     *
     * @param: [news]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 12:06
     **/

    void  add(News news);

    /**
     * 功能描述:
     *
     * @param: [newsVo]
     * @return: java.util.List<com.team.facade.pojo.News>
     * @auther: daixiao
     * @date: 2018/11/22 12:09
     **/

    List<News> findBy(NewsVo newsVo);

    /**
     * 功能描述:
     *
     * @param: [id]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 12:10
     **/
    void delete(News news);

    /**
     * 功能描述:
     *
     * @param: [news]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 12:10
     **/

    void update(News news);
}
