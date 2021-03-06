package com.demo.designpatterns.structural.decorator;

/**
 * 调料 - 牛奶
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    double cost() {
        return beverage.cost() + .10;
    }
}
