package com.demo.designpatterns.structural.bridge;

/**
 * @Description: 活期账户
 * @Author: chujunjie
 * @Date: Create in 21:49 2019/1/25
 * @Modified By
 */
public class DepositAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开一个活期账户");
        return new DepositAccount();
    }

    @Override
    public void queryAccountType() {
        System.out.println("这是一个活期账户");
    }
}
