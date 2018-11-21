package com.team.shopping.adressserver.service.impl;

import com.team.facade.pojo.Address;
import com.team.shopping.adressserver.mapper.AddressMapper;
import com.team.shopping.adressserver.service.AddressService;
import com.team.shopping.adressserver.vo.AddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/21 10:37
 * @Description:
 * @Version: 1.0
 */
@Service
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
        return  0;
    }

    @Override
    public int delete(Address address) {
        return  0;
    }

    @Override
    public int add(Address address) {
        return  0;
    }
}
