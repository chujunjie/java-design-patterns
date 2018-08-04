package com.demo.designpatterns.observerPattern;

/**
 * @Description: 观察者接口
 * @Author: chujunjie
 * @Date: Create in 11:16 2018/8/3
 * @Modified By
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
