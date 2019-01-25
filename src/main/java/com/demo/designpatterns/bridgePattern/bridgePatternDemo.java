package com.demo.designpatterns.bridgePattern;

/**
 * @Description: 桥接模式：将抽象部分与它的具体实现部分分离，使他们都可以独立的变化
 *                        通过组合的方式建立两个类之间的联系而不是继承
 *               适用场景：抽象和具体实现之间需要增加更多的灵活性
 *                        一个类存在两个以上独立变化的维度，并且需要支持扩展
 *
 *                  应用：jdbc的Driver，具体的行为实现层，交由不同的数据厂商实现
 * @Author: chujunjie
 * @Date: Create in 21:33 2019/1/25
 * @Modified By
 */
public class bridgePatternDemo {
    public static void main(String[] args) {

        /* 账户的具体实现层Account与Blank的抽象层分离，
        Blank的具体行为委托给具体实现层，并且支持扩展，
        新的业务场景加入，只需新增不同的银行及不同的账户 */
        ABCBank abcBank = new ABCBank(new DepositAccount());
        Account account = abcBank.openAccount();
        account.queryAccountType();
    }
}
