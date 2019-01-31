package com.demo.designpatterns.structural.bridge;

/**
 * @Description: 账号行为接口
 * @Author: chujunjie
 * @Date: Create in 21:47 2019/1/25
 * @Modified By
 */
public interface Account {
    /**
     * 打开账号
     * @return Account
     */
    Account openAccount();

    /**
     * 查询储蓄类型
     */
    void queryAccountType();
}
