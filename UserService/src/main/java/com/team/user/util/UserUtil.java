package com.team.user.util;

import java.util.UUID;

/**
 * @Auther: qin
 * @Date: 2018/11/26 19:56
 * @Description:
 * @Version: 1.0
 */
public class UserUtil {

    public static String getNum(){
        StringBuffer num = new StringBuffer();
        UUID uuid = UUID.randomUUID();
        String[] idd=uuid.toString().split("-");
        num.append(idd[0]);
        num.append(idd[1]);
        return  num.toString().trim();
    }


}
