package com.demo.designpatterns.behavioral.strategy;

/**
 * @Description: VIP客户
 * @Author: chujunjie
 * @Date: Create in 8:41 2018/8/2
 * @Modified By
 */

@PriceRegion(min = 10000,max = 30000)
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * 0.9;
    }
}
