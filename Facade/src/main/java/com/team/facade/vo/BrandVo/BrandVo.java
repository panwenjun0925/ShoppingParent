package com.team.facade.vo.BrandVo;

import java.io.Serializable;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 11:16
 * @Description:
 * @Version: 1.0
 */
public class BrandVo implements Serializable {
    private static final long serialVersionUID = 4186636476814347846L;
    private ConstomBrand constomBrand;

    public ConstomBrand getConstomBrand() {
        return constomBrand;
    }

    public void setConstomBrand(ConstomBrand constomBrand) {
        this.constomBrand = constomBrand;
    }
}
