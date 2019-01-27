package com.demo.designpatterns.templateMethodPattern;

/**
 * @Description: 模板方法模式：模板方法定义了一个算法的步骤，并允许子类为一个或多个步骤提供实现。
 *                            即模板方法模式在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。
 *                            模板方法使得子类在不改变算法结构的情况下，重新定义算法中的某些步骤。
 *
 *               原则：8.好莱坞原则：别调用我们，我们会调用你（是基于高层组件对待底层组件而言）
 *
 *               应用场景：JDK Arrays.sort
 *                        HttpServlet.service/doGet/doPost等
 *                        mybatis BaseExecutor.doUpdate等
 *               模板方法、策略、工厂方法三者区别：
 *                                              模板方法：子类决定如何实现算法中的方法，用继承封装算法
 *                                              策略：封装可互换的行为，然后使用委托来决定要采用哪一个行为，用组合封装算法
 *                                              工厂方法：由子类决定实例化哪个具体类，是模板方法的一种特殊版本
 * @Author: chujunjie
 * @Date: Create in 9:14 2018/8/6
 * @Modified By
 */
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareDrink();
    }
}
