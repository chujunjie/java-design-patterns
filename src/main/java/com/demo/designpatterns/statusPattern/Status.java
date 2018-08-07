package com.demo.designpatterns.statusPattern;

/**
 * @Description: 状态接口
 * @Author: chujunjie
 * @Date: Create in 14:05 2018/8/7
 * @Modified By
 */
public interface Status {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
