package com.github.learning.common.context;

import com.github.learning.common.constant.CommonConstants;

import java.util.HashMap;
import java.util.Map;

public class BaseContextHandler {

    public static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>();

    public static void set(String key, Object value) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        map.put(key, value);
    }

    public static Object get(String key){
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        return map.get(key);
    }

    public static void init(){
        Map<String,Object> map=threadLocal.get();
        if (map == null){
            map=new HashMap<String,Object>();
            threadLocal.set(map);
        }
    }

    public static void remove(){
        threadLocal.remove();
    }

    public static String getUserID(){
        Object value = get(CommonConstants.CONTEXT_KEY_USER_ID);
        return value==null?null:value.toString();
    }

    public static String getUserName(){
        Object value = get(CommonConstants.CONTEXT_KEY_USER_NAME);
        return value==null?null:value.toString();
    }

    public static String getName(){
        Object value = get(CommonConstants.CONTEXT_KEY_USER_NAME);
        return value==null?null:value.toString();
    }

    public static void setUserID(String userID){
        set(CommonConstants.CONTEXT_KEY_USER_ID,userID);
    }

    public static void setUserName(String userName){
        set(CommonConstants.CONTEXT_KEY_USER_NAME,userName);
    }

    public static void setName(String name){
        set(CommonConstants.CONTEXT_KEY_USER_NAME,name);
    }

}
