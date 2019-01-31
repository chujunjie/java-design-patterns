package com.demo.designpatterns.creational.factory;

/**
 * @Description: 披萨店抽象类
 * @Author: chujunjie
 * @Date: Create in 19:08 2018/8/4
 * @Modified By
 */
public abstract class PizzaStore {

    Pizza pizza;

    public final Pizza orderPizza(String type) {
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
