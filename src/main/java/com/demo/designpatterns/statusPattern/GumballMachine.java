package com.demo.designpatterns.statusPattern;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:08 2018/8/7
 * @Modified By
 */
@Getter
@Setter
public class GumballMachine {
    Status soldOutStatus;
    Status noQuarterStatus;
    Status hasQuarterStatus;
    Status soldStatus;
    Status winnerStatus;

    Status status = soldOutStatus;     //追踪当前状态
    int count = 0;                   //记录糖果数

    public GumballMachine(int count) {
        soldOutStatus = new SoldOutStatus(this);
        noQuarterStatus = new NoQuarterStatus(this);
        hasQuarterStatus = new HasQuarterStatus(this);
        soldStatus = new SoldStatus(this);
        winnerStatus = new WinnerStatus(this);
        this.count = count;
        if (count > 0) {
            status = noQuarterStatus;
        }
    }

    public void insertQuarter() {
        status.insertQuarter();
    }

    public void ejectQuarter() {
        status.ejectQuarter();
    }

    public void turnCrank() {
        status.turnCrank();
        status.dispense();                 //我们不需要单独实现dispense方法，可以把这个方法写入turnCrank里面
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

}
