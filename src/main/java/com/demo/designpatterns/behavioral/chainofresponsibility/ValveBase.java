package com.demo.designpatterns.behavioral.chainofresponsibility;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:38 2019/7/2
 * @Modified By
 */
public abstract class ValveBase implements Valve {
    protected Valve next;

    @Override
    public void setNext(Valve valve) {
        this.next = valve;
    }

    @Override
    public Valve getNext() {
        return this.next;
    }
}
