package com.demo.designpatterns.bridgePattern;

/**
 * @Description: 银行抽象类 将方法openAccount()和queryAccountType()委托给Account
 * @Author: chujunjie
 * @Date: Create in 21:55 2019/1/25
 * @Modified By
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
