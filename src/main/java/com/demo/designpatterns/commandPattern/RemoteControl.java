package com.demo.designpatterns.commandPattern;

/**
 * @Description: 控制器（执行器）
 * @Author: chujunjie
 * @Date: Create in 13:47 2018/8/5
 * @Modified By
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    //一共可以添加7个电器开关
    public RemoteControl() {

        //在构造器中，只需实例化并初始化这两个开关的数组
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 1; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int num, Command onCommand, Command offCommand) {
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    public void onButtonWasPressed(int num) {
        onCommands[num].execute();
        undoCommand = onCommands[num];
    }

    public void offButtonWasPressed(int num) {
        offCommands[num].execute();
        undoCommand = offCommands[num];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff=new StringBuffer();
        stringBuff.append("\n------Remote Control------\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuff.append("[slot" + i + "]"
                    + onCommands[i].getClass().getName() + " "
                    + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
