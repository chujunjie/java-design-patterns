package com.demo.designpatterns.adapterPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 18:14 2018/8/5
 * @Modified By
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm fly a short distance");
    }
}
