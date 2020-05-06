package com.demo.designpatterns.creational.singleton;

/**
 * @Description: ThreadLocal “单例”
 *               为每个线程提供一个独立的变量副本
 * @Author: chujunjie
 * @Date: Create in 23:08 2019/1/14
 * @Modified By
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE
            = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL_INSTANCE.get();
    }
}
