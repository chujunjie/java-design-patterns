package com.demo.designpatterns.structural.bridge;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:58 2019/1/25
 * @Modified By
 */
public class ABCBank extends Bank{

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开ABC银行");
        return super.account.openAccount();
    }
}
