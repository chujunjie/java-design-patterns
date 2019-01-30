package com.demo.designpatterns.mediatorPattern;

/**
 * @Description: 中介者模式：定义一个封装一组对象如何交互的对象，通过使对象明确地相互引用来促进松散耦合，
 *                          并允许独立地改变它们的交互
 *                    优点：将一对多转换成了一对一，降低程序复杂度
 *
 *                    应用：Timer.schedule(...)都调用了sched方法，TimeTask放到Timer中进行处理
 * @Author: chujunjie
 * @Date: Create in 22:35 2019/1/30
 * @Modified By
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User zhangsan = new User("zhangsan");
        User lisi = new User("lisi");
        zhangsan.sendMessage("Hey! I am zhangsan");
        lisi.sendMessage("Hey! I am lisi");
    }
}
