package com.team.address.service;

import com.team.facade.pojo.Address;
import com.team.facade.vo.addressVo.AddressVo;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/21 10:26
 * @Description:
 * @Version: 1.0
 */
public interface AddressService {
    /**
     * @param: [addressVo]
     * @return: java.util.List<com.team.facade.pojo.Address>
     * @auther: qin
     * @date: 2018/11/20
     * @Description:根据条件查询
     **/

    List<Address> getAllAddress(AddressVo addressVo);

    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/21
     * @Description:跟新
     **/


    int update(Address address);
    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/21
     * @Description:根据id删除
     **/


    int delete(Address address);
    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/21
     * @Description:添加
     **/


    int add(Address address);

}
