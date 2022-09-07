package com.wanjiale.wanjialeprogram.util;

import cn.hutool.core.lang.TypeReference;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;

public class JacksonUtil {

    /**
     * 对象 -> jsonStr
     * @param obj
     * @return
     */
    public static String beanToStr(Object obj){
        return JSONUtil.toJsonStr(obj);
    }

    /**
     * jsonStr -> 对象
     * @param str
     * @param bClass
     * @return
     * @param <T>
     */
    public static <T> T strToBean(String str, Class<T> bClass) {
        return JSONUtil.toBean(str, bClass);
    }

    /**
     * jsonStr -> 对象
     * @param str
     * @param tTypeReference
     * @return
     * @param <T>
     */
    public static <T> T strToBean(String str, TypeReference<T> tTypeReference){
        return JSONUtil.toBean(str, tTypeReference, true);
    }

    public static boolean isJSON2(String str) {
        boolean result = false;
        try {
            Object obj = JSON.parse(str);
            result = true;
        } catch (Exception e) {
            result = false;
        }
        return result;
    }
}
