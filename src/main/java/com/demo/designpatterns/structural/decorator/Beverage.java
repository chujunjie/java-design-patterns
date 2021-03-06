package com.demo.designpatterns.structural.decorator;

/**
 * 饮料抽象类，被装饰者
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    String getDescription(){
        return description;
    }

    abstract double cost();
}
