package com.demo.designpatterns.behavioral.command;

/**
 * @Description: 关闭电灯命令
 * @Author: chujunjie
 * @Date: Create in 14:19 2018/8/5
 * @Modified By
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
