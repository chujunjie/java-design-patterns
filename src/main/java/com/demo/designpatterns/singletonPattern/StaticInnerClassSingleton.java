package com.demo.designpatterns.singletonPattern;

/**
 * @Description: 静态内部类单例，达到懒加载的效果
 * @Author: chujunjie
 * @Date: Create in 13:08 2018/8/5
 * @Modified By
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
    private static class SingletonHolder {
        private final static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
}
