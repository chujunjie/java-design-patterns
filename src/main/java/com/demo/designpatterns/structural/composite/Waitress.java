package com.demo.designpatterns.structural.composite;

import java.util.Iterator;

/**
 * @Description: 服务员
 * @Author: chujunjie
 * @Date: Create in 14:13 2018/8/6
 * @Modified By
 */
public class Waitress {

    private MenuComponent allMenus;

    Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
       allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\n素食菜单\n-----");
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
        }
    }
}
