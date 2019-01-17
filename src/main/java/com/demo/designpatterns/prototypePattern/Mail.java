package com.demo.designpatterns.prototypePattern;

import lombok.Data;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:47 2019/1/17
 * @Modified By
 */
@Data
public class Mail implements Cloneable{
    private String name;
    private String address;
    private String content;

    public Mail() {
        System.out.println("Mail class constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
