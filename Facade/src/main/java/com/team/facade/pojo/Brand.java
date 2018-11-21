package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 22:47
 * @Description:
 * @Version: 1.0
 */
public class Brand implements Serializable {
    private static final long serialVersionUID = -7562132627683026247L;
    private Integer brandId;            //品牌Id
    private String brandName;       //品牌名字
    private String brandLog;        //品牌图标

    public Brand() {
    }

    public Brand(Integer brandId, String brandName, String brandLog) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandLog = brandLog;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLog() {
        return brandLog;
    }

    public void setBrandLog(String brandLog) {
        this.brandLog = brandLog;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", brandLog='" + brandLog + '\'' +
                '}';
    }
}
