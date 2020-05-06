package com.demo.designpatterns.behavioral.observer;

/**
 * @Description: 观察者接口
 * @Author: chujunjie
 * @Date: Create in 11:16 2018/8/3
 * @Modified By
 */
public interface Observer {

    /**
     * 更新状态
     *
     * @param temperature temperature
     * @param humidity    humidity
     * @param pressure    pressure
     */
    void update(float temperature, float humidity, float pressure);
}
