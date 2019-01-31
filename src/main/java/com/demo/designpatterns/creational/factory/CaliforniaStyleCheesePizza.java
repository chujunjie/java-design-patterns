package com.demo.designpatterns.creational.factory;

/**
 * @Description: 具体披萨子类
 * @Author: chujunjie
 * @Date: Create in 19:20 2018/8/4
 * @Modified By
 */
public class CaliforniaStyleCheesePizza extends Pizza{

    public CaliforniaStyleCheesePizza() {
        name = "加利福尼亚口味奶酪披萨";
        dough = "薄壳面团";
        sauce = "番茄酱";
        toppings.add("碎奶酪");
    }
}
