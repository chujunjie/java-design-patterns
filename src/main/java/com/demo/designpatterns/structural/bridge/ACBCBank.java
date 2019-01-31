package com.demo.designpatterns.structural.bridge;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 22:02 2019/1/25
 * @Modified By
 */
public class ACBCBank extends Bank {

    public ACBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开ACBC银行");
        return super.account.openAccount();
    }
}
