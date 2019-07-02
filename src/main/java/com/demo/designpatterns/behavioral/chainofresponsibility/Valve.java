package com.demo.designpatterns.behavioral.chainofresponsibility;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:20 2019/7/2
 * @Modified By
 */
public interface Valve {
    void setNext(Valve valve);

    Valve getNext();

    void invoke(Article article);
}
