package com.demo.designpatterns.commandPattern;

/**
 * @Description: 命令接口
 * @Author: chujunjie
 * @Date: Create in 13:39 2018/8/5
 * @Modified By
 */
public interface Command {
    //执行
    void execute();

    //撤销命令
    void undo();
}
