package com.team.facade.pojo;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 22:47
 * @Description:
 * @Version: 1.0
 */
public class Brand {
    private int brandId;
    private String brandName;
    private String brandLog;

    public Brand() {
    }

    public Brand(int brandId, String brandName, String brandLog) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandLog = brandLog;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
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
