package com.demo.designpatterns.commandPattern;

/**
 * @Description: 打开电灯的命令
 * @Author: chujunjie
 * @Date: Create in 13:42 2018/8/5
 * @Modified By
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
