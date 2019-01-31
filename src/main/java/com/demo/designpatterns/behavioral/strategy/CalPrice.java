package com.demo.designpatterns.behavioral.strategy;

/**
 * 策略接口
 */
public interface CalPrice {
    //根据原价返回一个最终价格
    Double calPrice(Double originPrice);
}
