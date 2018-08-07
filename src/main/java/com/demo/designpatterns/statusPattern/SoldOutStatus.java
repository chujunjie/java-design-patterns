package com.demo.designpatterns.statusPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:16 2018/8/7
 * @Modified By
 */
public class SoldOutStatus implements Status {
    GumballMachine gumballMachine;

    public SoldOutStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }
}
