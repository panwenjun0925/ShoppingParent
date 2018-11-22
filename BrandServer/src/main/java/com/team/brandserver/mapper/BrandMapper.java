package com.team.brandserver.mapper;

import com.team.brandserver.vo.BrandVo;
import com.team.facade.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 11:18
 * @Description:
 * @Version: 1.0
 */
@Repository
@Mapper
public interface BrandMapper {

    /**
     * 功能描述:
     *
     * @param: [brand]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 11:19
     **/

    void  add(Brand brand);

    /**
     * 功能描述:
     *
     * @param: [brandVo]
     * @return: java.util.List<com.team.facade.pojo.Brand>
     * @auther: daixiao
     * @date: 2018/11/22 11:19
     **/

    List<Brand> findBy(BrandVo brandVo);

    /**
     * 功能描述:
     *
     * @param: [brand]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 11:22
     **/

    void delete(Integer id);

    /**
     * 功能描述:
     *
     * @param: [brand]
     * @return: void
     * @auther: daixiao
     * @date: 2018/11/22 11:23
     **/

    void update(Brand brand);
}
