package com.demo.designpatterns.templateMethodPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 9:13 2018/8/6
 * @Modified By
 */
public class Tea extends DrinkWithHook {
    @Override
    void brewing() {
        System.out.println("泡茶...");
    }

    @Override
    void pourInCup() {
        System.out.println("把茶倒进杯子...");
    }
}
