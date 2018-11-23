package com.team.facade.vo.userVo;

import java.io.Serializable;

/**
 * @Auther: qin
 * @Date: 2018/11/22 12:26
 * @Description:
 * @Version: 1.0
 */
public class UserVo implements Serializable {
    private static final long serialVersionUID = 4427077165461111930L;
    private CustomUser customUser;

    public CustomUser getCustomUser() {
        return customUser;
    }

    public void setCustomUser(CustomUser customUser) {
        this.customUser = customUser;
    }
}
