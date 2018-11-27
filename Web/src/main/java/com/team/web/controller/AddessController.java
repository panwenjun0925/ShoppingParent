package com.team.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.team.facade.IFacade.IAddressFacade;
import com.team.facade.pojo.Address;
import com.team.facade.vo.addressVo.AddressVo;
import com.team.facade.vo.addressVo.CustomAddress;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: qin
 * @Date: 2018/11/23 10:39
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/address")
public class AddessController {
    @Reference(timeout = 10000)
    private IAddressFacade facade;

//    @RequestMapping("/getAllAddress")
//    public String getAll(AddressVo addressVo, Model model){
//        List<Address> all = facade.getAll(addressVo);
//        model.addAttribute("addresses",all);
//        return "address";
//    }

    @RequestMapping("/getAddressById/{id}")
    public String getAddressById(@PathVariable("id") Integer id, Model model){
        AddressVo addressVo = new AddressVo();
        CustomAddress customAddress = new CustomAddress();
        customAddress.setAddressId(id);
        addressVo.setCustomAddress(customAddress);

        List<Address> all = facade.getAll(addressVo);
        model.addAttribute("addresses",all);
        return "address";
    }

    @PostMapping("/addAddress")
    public String addAddress(Address address){
        facade.add(address);
        return "";
    }

    @PostMapping("/delete")
    public String delete(Address address){
        facade.deleteById(address);
        return "";
    }

    public String updateAddress(Address address){
        facade.update(address);
        return "";
    }

    @RequestMapping("/getAddressById1/{id}")
    @ResponseBody
    public Address sendToOrder(@PathVariable("id") Integer id){
        AddressVo addressVo = new AddressVo();
        CustomAddress customAddress = new CustomAddress();
        customAddress.setAddressId(id);
        addressVo.setCustomAddress(customAddress);
        List<Address> all = facade.getAll(addressVo);
        return all.get(0);
    }

    @RequestMapping("/getAddressById2")
    public String turnUpdate(Integer orderId, Integer addressId,Model model){
        AddressVo addressVo = new AddressVo();
        CustomAddress customAddress = new CustomAddress();
        customAddress.setAddressId(orderId);
        addressVo.setCustomAddress(customAddress);
        List<Address> all = facade.getAll(addressVo);
        model.addAttribute("address",all.get(0));
        model.addAttribute("orderId",orderId);
        return "address_update";
    }

    @RequestMapping("/updateAddress")
    public String updateAddress(Address address,@RequestParam("orderId") Integer orderId){
        facade.update(address);
        return "redirect:/order/getById"+orderId;
    }


}
