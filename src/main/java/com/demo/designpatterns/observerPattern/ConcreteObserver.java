package com.demo.designpatterns.observerPattern;

/**
 * @Description: 具体观察者
 * @Author: chujunjie
 * @Date: Create in 11:17 2018/8/3
 * @Modified By
 */
public class ConcreteObserver implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        System.out.println("温度观察者更新状态了! 当前温度为" + temperature);
    }
}
