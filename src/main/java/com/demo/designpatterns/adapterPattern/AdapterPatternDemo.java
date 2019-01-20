package com.demo.designpatterns.adapterPattern;

/**
 * @Description:  适配器模式：将一个类的接口，转换成客户期望的另一个接口。
 *                           适配器让原本接口不兼容的类可以合作无间。
 *                           是在软件迭代过程中一种折中的解决方案。
 *                           分为类适配器（利用继承）和对象适配器（利用组合）
 *
 *                应用场景：迭代器适配早期java的枚举器
*                          jdk xmlAdapter
 *                         spring aop advisorAdapter
 *                         spring jpa JpaVendorAdapter
 *                         spring mvc HandlerAdapter
 * @Author: chujunjie
 * @Date: Create in 18:17 2018/8/5
 * @Modified By
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        TransformAdapter adapter = new TransformAdapter(turkey);
        testDuck(adapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
