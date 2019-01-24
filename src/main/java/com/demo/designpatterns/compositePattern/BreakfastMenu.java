package com.demo.designpatterns.compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: 早餐菜单，如果是以散列表的形式存储，可使用menuItems.values().iterator();————取值的迭代器
 * @Author: chujunjie
 * @Date: Create in 14:09 2018/8/6
 * @Modified By
 */
public class BreakfastMenu {

    private List<MenuItem> menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    //ArrayList本身就有迭代器，直接返回即可
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
