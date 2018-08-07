package com.demo.designpatterns.statusPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:20 2018/8/7
 * @Modified By
 */
public class SoldStatus implements Status {
    GumballMachine gumballMachine;

    public SoldStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get your another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
        } else {
            System.out.println("Oops, out of gumballs");
            gumballMachine.setStatus(gumballMachine.getSoldOutStatus());
        }
    }
}
