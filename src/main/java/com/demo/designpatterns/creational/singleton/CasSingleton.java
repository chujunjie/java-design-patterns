package com.demo.designpatterns.creational.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description: CAS实现单例模式
 * @Author: chujunjie
 * @Date: Create in 19:10 2020/1/4
 * @Modified By
 */
public class CasSingleton {

    private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<>();

    private CasSingleton() {
    }

    public static CasSingleton getInstance() {
        for (; ; ) {
            CasSingleton singleton = INSTANCE.get();
            if (null != singleton)
                return singleton;
            singleton = new CasSingleton();
            if (INSTANCE.compareAndSet(null, singleton))
                return singleton;
        }
    }
}
