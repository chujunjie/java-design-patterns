package com.demo.designpatterns.singletonPattern;

/**
 * @Description: 懒汉式单例
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