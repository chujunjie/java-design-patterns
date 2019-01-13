package com.demo.designpatterns.singletonPattern;

import java.io.Serializable;

/**
 * @Description: 饿汉式：类被加载时创建，没有懒加载的效果，降低了内存利用率
 * @Author: chujunjie
 * @Date: Create in 12:36 2018/8/5
 * @Modified By
 */
public class HungrySingleton implements Serializable {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        // 简单防止反射攻击，适用于饿汉，静态内部类
        if (null != instance) {
            throw new RuntimeException("单例模式禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    // 注意不能是static的readResolve，否则获取不到
    private Object readResolve() {
        return instance;
    }
}
