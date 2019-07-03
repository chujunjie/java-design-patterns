package com.demo.designpatterns.behavioral.chainofresponsibility;

import java.util.function.Supplier;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:17 2019/7/2
 * @Modified By
 */
public interface Pipeline<T> {
    Pipeline<T> setBasic(Supplier<? extends Valve> supplier);

    Valve getBasic();

    Pipeline<T> addValve(Supplier<? extends Valve> supplier);

    void handle();
}
