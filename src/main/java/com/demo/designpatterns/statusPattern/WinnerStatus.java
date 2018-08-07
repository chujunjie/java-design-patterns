package com.demo.designpatterns.statusPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:13 2018/8/7
 * @Modified By
 */
public class WinnerStatus implements Status {
    GumballMachine gumballMachine;

    public WinnerStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    public void dispense() {
        System.out.println("You're a winner ! you get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setStatus(gumballMachine.getSoldOutStatus());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
            } else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setStatus(gumballMachine.getSoldOutStatus());
            }
        }
    }
}
