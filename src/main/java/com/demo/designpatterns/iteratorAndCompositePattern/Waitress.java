package com.demo.designpatterns.iteratorAndCompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description: 服务员
 * @Author: chujunjie
 * @Date: Create in 14:13 2018/8/6
 * @Modified By
 */
public class Waitress {

    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
