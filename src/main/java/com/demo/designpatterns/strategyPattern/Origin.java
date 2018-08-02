package com.demo.designpatterns.strategyPattern;

/**
 * 策略实现类
 * 普通玩家
 */
@PriceRegion(max = 10000)
public class Origin implements CalPrice{
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice;
    }
}
