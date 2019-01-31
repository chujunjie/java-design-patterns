package com.demo.designpatterns.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:27 2019/1/31
 * @Modified By
 */
@Getter
@Setter
public abstract class Software {

    private String name;

    public abstract void accept(IVisitor visitor);
}
