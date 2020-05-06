package com.demo.designpatterns.creational.factory;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 19:17 2018/8/4
 * @Modified By
 */
public class CaliforniaPizzaFactory {

    Pizza pizza;

    //抽象方法
    public static Pizza createPizza(String type){
        if ("cheese".equals(type)) {
            return new CaliforniaStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new CaliforniaStyleVeggiePizza();
        }
        return null;
    }
}
