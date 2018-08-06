package com.demo.designpatterns.iteratorAndCompositePattern;

/**
 * @Description: 服务员
 * @Author: chujunjie
 * @Date: Create in 14:13 2018/8/6
 * @Modified By
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
       allMenus.print();
    }
}
