package com.demo.designpatterns.DecoratorPattern;

/**
 * Espresso 浓咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}
