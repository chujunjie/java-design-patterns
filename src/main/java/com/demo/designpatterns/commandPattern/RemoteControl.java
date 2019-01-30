package com.demo.designpatterns.commandPattern;

import java.util.Arrays;

/**
 * @Description: 控制器（执行器）
 * @Author: chujunjie
 * @Date: Create in 13:47 2018/8/5
 * @Modified By
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    {
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();

        Arrays.stream(onCommands).forEach(element -> element = noCommand);
        Arrays.stream(offCommands).forEach(element -> element = noCommand);
        undoCommand = noCommand;
    }

    public RemoteControl() {
    }

    public void setCommand(int num, Command onCommand, Command offCommand) {
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    /**
     * 打开按钮
     * @param num
     */
    public void onButtonWasPressed(int num) {
        onCommands[num].execute();
        undoCommand = onCommands[num];
    }

    /**
     * 关闭按钮
     * @param num
     */
    public void offButtonWasPressed(int num) {
        offCommands[num].execute();
        undoCommand = offCommands[num];
    }

    /**
     * 撤销按钮
     */
    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------Remote Control------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot")
                    .append(i)
                    .append("]")
                    .append(onCommands[i].getClass().getName())
                    .append(" ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return sb.toString();
    }

}
