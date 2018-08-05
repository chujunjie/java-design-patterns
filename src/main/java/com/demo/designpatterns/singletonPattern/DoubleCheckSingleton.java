package com.demo.designpatterns.singletonPattern;

/**
 * @Description:  双重校验锁单例，实现了懒加载，又解决了线程并发问题，同时还解决了执行效率问题
 * @Author: chujunjie
 * @Date: Create in 12:33 2018/8/5
 * @Modified By
 */
class DoubleCheckSingleton {

    //volatile保证变量可见性，并达到禁止指令重排优化的效果
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
