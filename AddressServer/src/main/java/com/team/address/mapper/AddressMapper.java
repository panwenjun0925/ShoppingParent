package com.team.address.mapper;

import com.team.address.vo.AddressVo;
import com.team.facade.pojo.Address;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/21 10:30
 * @Description:
 * @Version: 1.0
 */
public interface AddressMapper {
    /**
     * @param: [addressVo]
     * @return: java.util.List<com.team.facade.pojo.Address>
     * @auther: qin
     * @date: 2018/11/21
     * @Description:根据条件查询所有地址
     **/

    List<Address> getAll(AddressVo addressVo);
    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/21
     * @Description:添加地址
     **/

    int add(Address address);
    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/21
     * @Description:根据id删除
     **/

    int deleteById(Address address);
    /**
     * @param: [address]
     * @return: int
     * @auther: qin
     * @date: 2018/11/21
     * @Description:跟新地址
     **/

    int update(Address address);

}
