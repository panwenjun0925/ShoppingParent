package com.team.address.service.impl;

import com.team.facade.pojo.Address;
import com.team.address.mapper.AddressMapper;
import com.team.address.service.AddressService;
import com.team.facade.vo.addressVo.AddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/21 10:37
 * @Description:
 * @Version: 1.0
 */
@Component
@Transactional
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public List<Address> getAllAddress(AddressVo addressVo) {
        return mapper.getAll(addressVo);
    }

    @Override
    public int update(Address address) {
        return  mapper.update(address);
    }

    @Override
    public int delete(Address address) {
        return  mapper.deleteById(address);
    }

    @Override
    public int add(Address address) {
        return  mapper.add(address);
    }
}
