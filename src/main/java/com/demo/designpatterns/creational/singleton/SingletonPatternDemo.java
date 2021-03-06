package com.demo.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * @Description: 单例模式：确保一个类只产生一个实例，并提供一个全局访问点。
 *
 *               全局变量的缺点：大量的全局变量指向小对象造成命名空间的污染。
 * @Author: chujunjie
 * @Date: Create in 23:51 2018/8/4
 * @Modified By
 */
public class SingletonPatternDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();

        // 序列化对单例的破坏
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(hungrySingleton);
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        /* readObject方法读取可序列化的类会通过反射new一个instance
         * 并且其中hasReadResolveMethod方法会判断，如果读取的是一个有readResolve
         * 方法的序列化类则会通过反射再把readResolve返回的值赋值回去 */
//        HungrySingleton newSingleton = (HungrySingleton) ois.readObject();
//
//        System.out.println(hungrySingleton);
//        System.out.println(newSingleton);

        //对单例的反射攻击
//        Class objClass = HungrySingleton.class;
//        HungrySingleton instance = HungrySingleton.getInstance();
//        Constructor constructor = objClass.getDeclaredConstructor();
//        constructor.setAccessible(true); // 设置访问权限
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);

        // 枚举类单例的序列化
//        EnumSingleton enumSingleton = EnumSingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(enumSingleton);
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumSingleton newEnumSingleton = (EnumSingleton) ois.readObject();
//
//        System.out.println(enumSingleton);
//        System.out.println(newEnumSingleton);
//        System.out.println(enumSingleton == newEnumSingleton);

        // 枚举类单例的反射
        Class enumSingletonClass = EnumSingleton.class;
        // 枚举类型没有无参构造
        Constructor constructor = enumSingletonClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumSingleton instance = (EnumSingleton) constructor.newInstance("hello", 1);
        EnumSingleton newInstance = EnumSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);

        MySingleton mySingleton = EnumSingleton.getInstance();
        mySingleton.doSomething();
    }

}

