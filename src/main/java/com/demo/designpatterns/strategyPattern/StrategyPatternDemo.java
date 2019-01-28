package com.demo.designpatterns.strategyPattern;

/**
 * @Description: 策略模式：策略模式定义了算法族，分别封装起来，让他们之间可以互相替换， 此模式让算法的变化独立于使用算法的客户。
 *
 *               原则：
 *               1：找出应用中可能需要变化之处，把它们独立起来，不要和那些不需要变化的混在一起；
 *               2：针对接口编程，而不是针对实现编程；
 *               3：多用组合，少用继承。
 *
 *               使用场景：
 *               1.针对同一类型问题的多种处理方式，仅仅是具体行为有差别时；
 *               2.需要安全地封装多种同一类型的操作时；
 *               3.出现同一抽象类有多个子类，而又需要使用 if-else 或者 switch-case 来选择具体子类时。
 *
 *               应用：Comparator不同的比较器
 *                    spring Resource策略接口
 *                    spring bean初始化 InstantiationStrategy
 * @Author: chujunjie
 * @Date: Create in 18:56 2018/8/1
 * @Modified By
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy(5000D);
        System.out.println("客户本次需要支付的金额为：" + customer.pay());
        customer.buy(6000D);
        System.out.println("客户本次需要支付的金额为：" + customer.pay());
        customer.buy(20000D);
        System.out.println("客户本次需要支付的金额为：" + customer.pay());
    }

}

