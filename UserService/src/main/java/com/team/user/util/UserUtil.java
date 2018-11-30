package com.team.user.util;

import org.junit.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Auther: qin
 * @Date: 2018/11/26 19:56
 * @Description:
 * @Version: 1.0
 */
public class UserUtil {
    /**
     * @param: []
     * @return: java.lang.String
     * @auther: qin
     * @date: 2018/11/30
     * @Description:得到会员编号
     **/

    public static String getNum(){
        StringBuffer num = new StringBuffer();
        UUID uuid = UUID.randomUUID();
        String[] idd=uuid.toString().split("-");
        num.append(idd[0]);
        num.append(idd[1]);
        return  num.toString().trim();
    }
    /**
     * @param: []
     * @return: java.lang.String
     * @auther: qin
     * @date: 2018/11/30
     * @Description:注册时间
     **/

    public static String getResisterTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = dateFormat.format(new Date());
        return time;
    }

    /**
     * @param: [password]
     * @return: java.lang.String
     * @auther: qin
     * @date: 2018/11/30
     * @Description:MD5加密
     **/

    public static String encryption(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(password.getBytes());
            StringBuilder sb =new StringBuilder();
            for(byte b:result){
                int number = b&0xff;
                String hex = Integer.toHexString(number);
                if(hex.length() == 1){
                    sb.append("0"+hex);
                }else{
                    sb.append(hex);
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "" ;
    }

}
