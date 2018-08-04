package com.demo.designpatterns.DecoratorPattern;

/**
 * DarkRoast 深焙咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    double cost() {
        return .89;
    }
}
