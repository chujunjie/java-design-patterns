package com.demo.designpatterns.facadePattern;

/**
 * @Description: 外观模式(门面模式)：提供统一的接口，用来访问子系统中的一群接口。
 *                        外观模式定义了一个高层接口，让子系统更容易使用（比如，配合命令模式形成一个宏命令？）
 *
 *               优点：松散耦合、简单易用、更好的划分层次访问
 *
 *               设计原则：7.最少知识原则(迪米特法则)：只和你的密友谈话
 *                        就任何对象而言，在该对象的方法内，我们只应该调用属于以下范围的方法：
 *                        1)该对象本身;
 *                        2)被当做方法参数而传进来的对象;
 *                        3)此方法所创建或实例化的任何对象;
 *                        4)对象的任何组件(这里的组件是实例变量所引用的任何对象，也就是“有一个”的关系).
 *
 *               ****装饰者、适配器、外观三者区别：
 *                                               装饰者：不改变接口，但加入责任（赋予新的属性）
 *                                               适配器：将一个接口转换成另一个接口
 *                                               外观：让接口更简单
 * @Author: chujunjie
 * @Date: Create in 20:06 2018/8/5
 * @Modified By
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.start();
        facade.shutDown();
    }
}
