package com.demo.designpatterns.behavioral.strategy;

/**
 * @Description:  超级会员客户
 * @Author: chujunjie
 * @Date: Create in 8:42 2018/8/2
 * @Modified By
 */

@PriceRegion(min = 30000)
public class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * 0.8;
    }
}
