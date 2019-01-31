package com.demo.designpatterns.creational.factory;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 19:24 2018/8/4
 * @Modified By
 */
public class CaliforniaStyleVeggiePizza extends Pizza {

    public CaliforniaStyleVeggiePizza() {
        name = "加利福尼亚口味素食披萨";
        dough = "薄壳面团";
        sauce = "番茄酱";
        toppings.add("洋葱");
        toppings.add("青椒");
    }

    @Override
    void cut() {
        System.out.println("正方形切片...");
    }
}
