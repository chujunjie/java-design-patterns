package com.demo.designpatterns.iteratorAndCompositePattern;

import java.util.ArrayList;

/**
 * @Description: 迭代器模式:提供一种方法顺序访问一种聚合对象中的各个元素，而又不暴露其内部的表示。
 *
 *               原则：9.单一责任原则：一个类应该只有一个引起变化的原因，高内聚、低耦合
 *
 * @Author: chujunjie
 * @Date: Create in 11:29 2018/8/6
 * @Modified By
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        breakfastMenu.addItem(new MenuItem("肉包","天津狗不理",false,3));
        LunchMenu lunchMenu = new LunchMenu();
        lunchMenu.addItem(new MenuItem("炒饭","扬州招牌",false,15));
        ArrayList<Menu> list = new ArrayList<>();
        list.add(breakfastMenu);
        list.add(lunchMenu);
        Waitress waitress = new Waitress(list);
        waitress.printMenu();
    }
}
