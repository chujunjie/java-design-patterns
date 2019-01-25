package com.demo.designpatterns.bridgePattern;

/**
 * @Description: 定期账户
 * @Author: chujunjie
 * @Date: Create in 21:51 2019/1/25
 * @Modified By
 */
public class SavingAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开一个定期账户");
        return new SavingAccount();
    }

    @Override
    public void queryAccountType() {
        System.out.println("这是一个定期账户");
    }
}
