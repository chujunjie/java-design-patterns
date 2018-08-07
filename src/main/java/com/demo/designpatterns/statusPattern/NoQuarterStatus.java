package com.demo.designpatterns.statusPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:24 2018/8/7
 * @Modified By
 */
public class NoQuarterStatus implements Status {
    GumballMachine gumballMachine;

    public NoQuarterStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine.setStatus(gumballMachine.getHasQuarterStatus());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned , but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
