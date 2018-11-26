package com.team.facade.vo.NewsVo;

import java.io.Serializable;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 12:09
 * @Description:
 * @Version: 1.0
 */
public class NewsVo implements Serializable {
    private static final long serialVersionUID = 5048633807625994152L;
    private ConstomNews constomNews;

    public ConstomNews getConstomNews() {
        return constomNews;
    }

    public void setConstomNews(ConstomNews constomNews) {
        this.constomNews = constomNews;
    }
}
