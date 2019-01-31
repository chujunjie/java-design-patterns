package com.demo.designpatterns.structural.adapter;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 18:13 2018/8/5
 * @Modified By
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
