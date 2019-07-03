package com.demo.designpatterns.behavioral.chainofresponsibility;

import java.util.function.Supplier;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:34 2019/7/2
 * @Modified By
 */
public class StandardPipeline<T> implements Pipeline<T> {
    private Article article;
    private Valve basic;

    public StandardPipeline(Article article) {
        this.article = article;
    }

    @Override
    public Pipeline<T> setBasic(Supplier<? extends Valve> supplier) {
        this.basic = supplier.get();
        return this;
    }

    @Override
    public Valve getBasic() {
        return this.basic;
    }

    @Override
    public Pipeline<T> addValve(Supplier<? extends Valve> supplier) {
        if (null == this.basic) {
            this.basic = supplier.get();
            return this;
        }
        Valve valve = basic;
        while (null != valve.getNext()) {
            valve = valve.getNext();
        }
        valve.setNext(supplier.get());
        return this;
    }

    @Override
    public void handle() {
        basic.invoke(article);
    }
}
