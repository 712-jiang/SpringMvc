package com.slq.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-08-22:10
 */
public class JsonUtils {
    public static String ToJson(Object object) {
        return ToJson(object, "yyyy-MM-dd HH:MM:ss");
    }

    public static String ToJson(Object object, String StandardFromat) {
        //新建一个ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //不使用默认的时间戳方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //将输入的形式："yyyy-MM-dd HH:mm:ss"创建成一种自定义的时间format
        SimpleDateFormat sdf = new SimpleDateFormat(StandardFromat);
        //将自定义的DateFormat注入mapper
        mapper.setDateFormat(sdf);
        try {
            //将要转换成json的对象：object注入方法中
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
