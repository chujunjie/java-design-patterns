package com.demo.designpatterns.structural.decorator;

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
