package com.demo.designpatterns.commandPattern;

/**
 * @Description: 电灯（接收者）
 * @Author: chujunjie
 * @Date: Create in 13:44 2018/8/5
 * @Modified By
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + "的灯打开了");
    }

    public void off() {
        System.out.println(name + "的灯熄灭了");
    }
}
