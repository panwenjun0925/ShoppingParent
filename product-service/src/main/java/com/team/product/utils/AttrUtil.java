package com.team.product.utils;

import com.alibaba.fastjson.JSON;

/**
 * @Auther: YouQi
 * @Date: 2018/11/29 11:52
 * @Description:
 * @Version: 1.0
 */
public class AttrUtil {
    public static String attrToJsonString(String attr){

        String[] split = attr.split(",");

        String jsonString = JSON.toJSONString(split);
        return jsonString;
    }
}
