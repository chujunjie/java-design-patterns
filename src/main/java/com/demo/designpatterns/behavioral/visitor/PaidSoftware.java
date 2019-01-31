package com.demo.designpatterns.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:33 2019/1/31
 * @Modified By
 */
@Setter
@Getter
public class PaidSoftware extends Software {

    private double price;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
