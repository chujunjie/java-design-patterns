package com.demo.designpatterns.structural.decorator;

/**
 * 调料装饰者抽象类
 */
public abstract class CondimentDecorator extends Beverage{
    abstract String getDescription();
}
