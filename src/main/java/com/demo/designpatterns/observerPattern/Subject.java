package com.demo.designpatterns.observerPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 11:15 2018/8/3
 * @Modified By
 */
public interface Subject {
    //新增观察者
    void registerObserver(Observer observer);
    //移除观察者
    void removeObserver(Observer observer);
    //通知观察者
    void notifyObserver();
}
