package com.demo.designpatterns.statusPattern;

import java.util.Random;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:13 2018/8/7
 * @Modified By
 */
public class HasQuarterStatus implements Status{

    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
    }

    public void turnCrank() {
        System.out.println("You turned..");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setStatus(gumballMachine.getWinnerStatus());
        } else {
            gumballMachine.setStatus(gumballMachine.getSoldStatus());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
