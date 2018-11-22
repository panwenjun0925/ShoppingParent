package com.team.newsserver.mapper;

import com.team.facade.pojo.News;
import com.team.newsserver.vo.NewsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 12:04
 * @Description:
 * @Version: 1.0
 */
@Repository
@Mapper
public interface NewsMapper {

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
    void delete(Integer id);
    
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
