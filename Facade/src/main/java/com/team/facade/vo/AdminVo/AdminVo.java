package com.team.facade.vo.AdminVo;

import java.io.Serializable;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 17:55
 * @Description:
 * @Version: 1.0
 */
public class AdminVo implements Serializable {
    private static final long serialVersionUID = -266011131318935714L;
    private ConstomAdmin constomAdmin;

    public ConstomAdmin getConstomAdmin() {
        return constomAdmin;
    }

    public void setConstomAdmin(ConstomAdmin constomAdmin) {
        this.constomAdmin = constomAdmin;
    }
}
