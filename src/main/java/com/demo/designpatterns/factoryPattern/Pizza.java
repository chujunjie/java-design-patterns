package com.demo.designpatterns.factoryPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 披萨接口
 * @Author: chujunjie
 * @Date: Create in 18:26 2018/8/4
 * @Modified By
 */
public abstract class Pizza {
    //名称
    String name;
    //面团
    String dough;
    //酱料
    String sauce;
    //一系列佐料
    List<String> toppings = new ArrayList<>();

    //准备
    void prepare() {
        System.out.println("正在准备" + name + "...");
        System.out.println("打面团:" + dough);
        System.out.println("添加酱料：" + sauce);
        System.out.println("添加佐料:");
        for (String topping : toppings) {
            System.out.println("" + topping);
        }
    }

    //烘焙
    void bake(){
        System.out.println("烘焙25分钟...");
    }
    //切片
    void cut(){
        System.out.println("对角切片...");
    }
    //装盒
    void box(){
        System.out.println("正在装盒...");
    }

    public String getName(){
        return name;
    }

}
