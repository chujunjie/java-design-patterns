package com.demo.designpatterns.behavioral.strategy;

/**
 * 策略实现类
 * 普通玩家
 *
 * @author chujunjie
 */
@PriceRegion(max = 10000)
public class Origin implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice;
    }
}
