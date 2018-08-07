package com.demo.designpatterns.statusPattern;

/**
 * @Description: 状态模式：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 *
 *               策略模式与状态模式的区别：
 *                                      策略模式中客户通常主动指定Context所要组合的策略对象，是除了继承之外的一种弹性替代方案。
 *
 *                                      而状态模式是不用Context中放置多条件判断的替代方案。通过将行为包装进状态对象中，你可以通过在context内简单地
 *                                      改变状态对象来改变Context的行为。
 * @Author: chujunjie
 * @Date: Create in 14:33 2018/8/7
 * @Modified By
 */
public class statusPatternDemo {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
