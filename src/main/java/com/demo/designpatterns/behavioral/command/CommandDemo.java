package com.demo.designpatterns.behavioral.command;

/**
 * @Description:  命令模式：将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。
 *                         命令模式也支持可撤销的操作。
 *
 *                应用场景：(1)队列请求：如日程安排、线程池、工作队列
 *                          (2)日志请求：事务等
 *                应用：Junit Test
 * @Author: chujunjie
 * @Date: Create in 13:49 2018/8/5
 * @Modified By
 */
public class CommandDemo {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light("厨房");
        control.setCommand(6, new LightOnCommand(light), new LightOffCommand(light));
        control.onButtonWasPressed(6);
        control.offButtonWasPressed(6);
        control.undoButtonWasPressed();
    }
}
