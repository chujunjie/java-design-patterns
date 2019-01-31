package com.demo.designpatterns.structural.decorator;

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
