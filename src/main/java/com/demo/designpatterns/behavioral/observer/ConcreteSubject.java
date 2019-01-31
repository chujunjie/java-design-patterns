package com.demo.designpatterns.behavioral.observer;

import java.util.ArrayList;

/**
 * @Description: 发布中心
 * @Author: chujunjie
 * @Date: Create in 11:16 2018/8/3
 * @Modified By
 */
public class ConcreteSubject implements Subject {

    // 用来标记是否自动推送给观察者
    private boolean changed = true;

    private ArrayList<Observer> observers = new ArrayList<>();  // 观察者列表
    private float temperature;  // 温度
    private float humidity;  // 湿度
    private float pressure;  // 气压

    // 这两个方法都需要一个观察者作为变量，该观察者是用来注册或被删除的。
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        } else {
            System.out.println("该观察者尚未注册！");
        }
    }

    // 当主题状态改变时，这个方法会被调用，以通知所有的观察者。
    @Override
    public void notifyObserver() {
        if (observers.size() == 0) {
            System.out.println("当前没有观察者存在！");
        }
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    protected synchronized void setChanged() {
        changed = true;
    }

    protected synchronized void clearChanged() {
        changed = false;
    }

    public synchronized boolean hasChanged() {
        return changed;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        if (changed) {
            notifyObserver();
        }
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        if (changed) {
            notifyObserver();
        }
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        if (changed) {
            notifyObserver();
        }
    }
}
