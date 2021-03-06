package com.demo.designpatterns.structural.composite;

import java.util.Iterator;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 13:51 2018/8/6
 * @Modified By
 */
public class LunchMenu{

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public LunchMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(MenuItem menuItem) {
        if (numberOfItems > MAX_ITEMS) {
            System.out.println("菜单已经满了！");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    //返回特定迭代器
    public Iterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }
}
