package com.demo.designpatterns.singletonPattern;

/**
 * @Description: 饿汉式：类被加载时创建，没有懒加载的效果，降低了内存利用率
 * @Author: chujunjie
 * @Date: Create in 12:36 2018/8/5
 * @Modified By
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
