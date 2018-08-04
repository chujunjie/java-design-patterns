package com.demo.designpatterns.DecoratorPattern;

/**
 * @Description: 装饰者模式：
 *               动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
 *
 *               原则：
 *               5.开放-关闭原则：类应该对扩展开放，对修改关闭。
 *
 *               应用场景：Java I/O包
 *               LineNumberInputStream也是一个具体的“装饰者”。它加上了计算行数的能力。
 *               ——>
 *               BufferedInputStream是一个具体的“装饰者”，它加入两种行为：利用缓冲输入来改进性能；
 *               用一个readLine()方法（用来一次读取一行文本输入数据）来增强接口。
 *               ——>
 *               FileInpuStream是被装饰的“组件”。
 *               Java I/O程序库提供了几个组件，包括了FileInputStream、StringBufferInputStream、ByteArrayInputStream……等。
 *               这些类都提 供了最基本的字节读取功能。
 * @Author: chujunjie
 * @Date: Create in 22:19 2018/8/3
 * @Modified By
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        //订一杯咖啡，不需要调料
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        //双倍摩卡的牛奶深焙
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription()
                + " $" + beverage1.cost());
    }
}



