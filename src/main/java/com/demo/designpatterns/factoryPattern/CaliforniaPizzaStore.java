package com.demo.designpatterns.factoryPattern;

/**
 * @Description: 披萨店子类
 * @Author: chujunjie
 * @Date: Create in 19:12 2018/8/4
 * @Modified By
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = CaliforniaPizzaFactory.createPizza(type);
        if (pizza == null) {
            System.out.println("抱歉，本店没有该披萨");
        }
        return pizza;
    }
}
