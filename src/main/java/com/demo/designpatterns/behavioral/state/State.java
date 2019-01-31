package com.demo.designpatterns.behavioral.state;

/**
 * @Description: 状态接口
 * @Author: chujunjie
 * @Date: Create in 14:05 2018/8/7
 * @Modified By
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
