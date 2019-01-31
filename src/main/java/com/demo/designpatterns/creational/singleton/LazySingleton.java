package com.demo.designpatterns.creational.singleton;

/**
 * @Description: 懒汉式单例，延迟加载
 * @Author: chujunjie
 * @Date: Create in 12:34 2018/8/5
 * @Modified By
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){
    }

    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            return new LazySingleton();
        }
        return instance;
    }
}
