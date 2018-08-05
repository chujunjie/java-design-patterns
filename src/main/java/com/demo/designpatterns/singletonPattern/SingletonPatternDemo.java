package com.demo.designpatterns.singletonPattern;

/**
 * @Description: 单例模式：确保一个类只产生一个实例，并提供一个全局访问点。
 *
 *               全局变量的缺点：大量的全局变量指向小对象造成命名空间的污染。
 * @Author: chujunjie
 * @Date: Create in 23:51 2018/8/4
 * @Modified By
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();

    }

}

