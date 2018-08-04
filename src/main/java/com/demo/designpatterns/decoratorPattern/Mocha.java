package com.demo.designpatterns.decoratorPattern;

/**
 * 调料 - 摩卡
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    double cost() {
        return beverage.cost() + .20;
    }
}
