package com.demo.designpatterns.behavioral.observer;

/**
 * @Description: 观察者模式：又称之为发布-订阅模式，观察者模式——在对象之间定义一对多的依赖，
 * 这样一来当一个对象改变状态，依赖它的对象都会收到通知，并自动更新。
 * <p>
 * 设计原则：4.为了交互对象之间松耦合设计而努力
 * <p>
 * 应用：JDK awt Event事件监听
 * java.util.EventListener
 * Guava EventBus（注册中心）配合@Subscribe使用
 * @Author: chujunjie
 * @Date: Create in 9:03 2018/8/3
 * @Modified By
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.registerObserver(observer);
        subject.setTemperature(50);
    }
}


