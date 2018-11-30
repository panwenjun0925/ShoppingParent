package com.team.product.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: YouQi
 * @Date: 2018/11/29 11:18
 * @Description:
 * @Version: 1.0
 */
public class TimeFormatUtil {
    private  static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String formatTime(Date date){

        String format = simpleDateFormat.format(date);
        return format;
    }

    public static Date formatDate(String date){

        Date parse = null;
        try {
            parse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }

}
