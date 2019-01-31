package com.demo.designpatterns.creational.factory;

/**
 * @Description: 抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
 *
 *               原则：
 *               6：依赖倒置原则：要依赖抽象，不要依赖具体类。
 *
 *               应用场景：spring IOC利用了工厂模式和反射机制（依赖注入）
 *
 *               注意：本示例中，应该进一步将具体的披萨原料用抽象工厂方式创建，而不是直接将属性赋予具体的披萨类
 *                     PizzaIngredientsFactory.createDough();等等。
 * @Author: chujunjie
 * @Date: Create in 19:18 2018/8/4
 * @Modified By
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        californiaPizzaStore.orderPizza("cheese");
        californiaPizzaStore.orderPizza("veggie");
        californiaPizzaStore.orderPizza("beef");
    }
}
