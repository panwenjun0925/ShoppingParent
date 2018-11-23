package com.team.facade.IFacade;

import com.team.facade.pojo.Address;
import com.team.facade.vo.addressVo.AddressVo;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 19:28
 * @Description:地址服务
 * @Version: 1.0
 */
public interface IAddressFacade {
    /**
     * @param: [addressVo]
     * @return: java.util.List<com.team.facade.pojo.Address>
     * @auther: qin
     * @date: 2018/11/22
     * @Description:根据条件查询所有
     **/

    List<Address> getAll(AddressVo addressVo);

    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/22
     * @Description:添加
     **/

    int add(Address address);

    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/22
     * @Description:根据id删除
     **/

    int deleteById(Address address);

    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/22
     * @Description:更新
     **/

    int update(Address address);
}
