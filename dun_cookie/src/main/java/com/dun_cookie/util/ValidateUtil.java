package com.dun_cookie.util;

import java.util.Map;

/**
 * 合法性校验工具类
 */
public class ValidateUtil {

    /*public Boolean isEmpty(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return true;
    }

    public Boolean isEmpty(Map map) {
        if (map == null && map.isEmpty()) {
            return false;
        }
        return true;
    }*/

    public String isEmpty(Object obj) {
        Class clazz = obj.getClass();
        String clazzName = clazz.getName();
        return clazzName;
    }
}
