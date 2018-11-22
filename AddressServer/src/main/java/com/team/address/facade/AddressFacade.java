package com.team.address.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.address.service.AddressService;
import com.team.facade.IFacade.IAddressFacade;
import com.team.facade.pojo.Address;
import com.team.facade.vo.addressVo.AddressVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/22 20:20
 * @Description:
 * @Version: 1.0
 */
@Service
public class AddressFacade implements IAddressFacade {
    @Autowired
    private AddressService addressService;

    @Override
    public List<Address> getAll(AddressVo addressVo) {
        return addressService.getAllAddress(addressVo);
    }

    @Override
    public int add(Address address) {
        return addressService.add(address);
    }

    @Override
    public int deleteById(Address address) {
        return addressService.delete(address);
    }

    @Override
    public int update(Address address) {
        return addressService.update(address);
    }
}
