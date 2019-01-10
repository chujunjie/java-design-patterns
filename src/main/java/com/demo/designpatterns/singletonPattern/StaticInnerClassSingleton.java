package com.demo.designpatterns.singletonPattern;

/**
 * @Description: 静态内部类单例，保证线程安全且达到懒加载的效果，缺点无法传参
 *
 * 类初始化的五种场景（主动引用）：
 * 1.遇到new、getstatic、setstatic或者invikestatic这4个字节码指令时，对应的java代码场景为：new一个关键字或者一个实例化对象时、
 *   读取或设置一个静态字段时(final修饰、已在编译期把结果放入常量池的除外)、调用一个类的静态方法时。
 * 2.使用java.lang.reflect包的方法对类进行反射调用的时候，如果类没进行初始化，需要先调用其初始化方法进行初始化。
 * 3.当初始化一个类时，如果其父类还未进行初始化，会先触发其父类的初始化。
 * 4.当虚拟机启动时，用户需要指定一个要执行的主类(包含main()方法的类)，虚拟机会先初始化这个类。
 * 5.当使用JDK 1.7等动态语言支持时，如果一个java.lang.invoke.MethodHandle实例最后的解析结果REF_getStatic、REF_putStatic、
 *   REF_invokeStatic的方法句柄，并且这个方法句柄所对应的类没有进行过初始化，则需要先触发其初始化。
 *
 * 静态内部类属于被动引用
 *
 * @Author: chujunjie
 * @Date: Create in 13:08 2018/8/5
 * @Modified By
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
    }

    /**
     * 利用类的初始化锁，调用getInstance时，访问静态内部类的静态成员，
     * 静态内部类则开始初始化（初始化外部类的时候不会初始化），
     * 然后SingletonHolder才在Singleton的运行时常量池里把符号引用
     * 替换为直接引用，这时静态对象instance也真正被创建。
     *
     * @return StaticInnerClassSingleton
     */
    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private final static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
}
