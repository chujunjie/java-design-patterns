package com.demo.designpatterns.behavioral.templatemethod;

/**
 * @Description: 饮料抽象类
 *
 *               钩子方法使用场景：算法中的某个步骤是可选的，比如本例中的饮料是否添加佐料
 * @Author: chujunjie
 * @Date: Create in 8:50 2018/8/6
 * @Modified By
 */
public abstract class DrinkWithHook {

    //声明为final,以免子类对算法重排序
    protected final void prepareDrink() {
        boilWater();
        brewing();
        pourInCup();
        if (customerWantsSeasoning()) {
            addSeasoning();
        }
    }

    //把水煮沸
    private void boilWater() {
        System.out.println("水煮沸了...");
    }

    //用水冲泡
    abstract void brewing();

    //倒进杯子
    abstract void pourInCup();

    //添加佐料
    private void addSeasoning() {
        System.out.println("添加佐料...");
    }

    boolean customerWantsSeasoning() {    //hook函数
        return false;
    }
}
