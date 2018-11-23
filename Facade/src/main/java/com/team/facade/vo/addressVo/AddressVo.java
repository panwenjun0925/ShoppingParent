package com.team.facade.vo.addressVo;


import java.io.Serializable;

/**
 * @Auther: qin
 * @Date: 2018/11/21 10:28
 * @Description:address拓展类
 * @Version: 1.0
 */
public class AddressVo implements Serializable {

    private static final long serialVersionUID = -7960755058487853560L;
    private CustomAddress customAddress;



    public CustomAddress getCustomAddress() {
        return customAddress;
    }

    public void setCustomAddress(CustomAddress customAddress) {
        this.customAddress = customAddress;
    }
}
