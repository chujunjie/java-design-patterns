package com.demo.designpatterns.behavioral.strategy;

/**
 * 客户类
 *
 * @author chujunjie
 */
public class Customer {

    // 客户消费总额
    private Double totalAmount = 0D;
    // 客户单次消费金额
    private Double amount = 0D;

    // 每个客户都有一个计算价格的策略,初始等级都为普通客户
    private CalPrice calPrice;

    public Double getTotalAmount() {
        return totalAmount;
    }

    // 根据消费总额来判断客户等级
    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;

        // 将策略的制定转移给了策略工厂，将这部分责任分离出去
        calPrice = CalPriceFactory.getInstance().createCalPrice(this);
    }

    // 计算客户最终购买这个商品所付的钱
    public Double pay() {
        return calPrice.calPrice(amount);
    }
}
