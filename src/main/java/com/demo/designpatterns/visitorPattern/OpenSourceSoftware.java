package com.demo.designpatterns.visitorPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:29 2019/1/31
 * @Modified By
 */
public class OpenSourceSoftware extends Software {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
