package com.demo.designpatterns.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 容器单例，线程不安全
 * @Author: chujunjie
 * @Date: Create in 22:55 2019/1/14
 * @Modified By
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap<>();

    private ContainerSingleton(){
    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNoneBlank(key) && null != instance) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
