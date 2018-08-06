package com.demo.designpatterns.iteratorAndCompositePattern;

/**
 * @Description: 迭代器模式:提供一种方法顺序访问一种聚合对象中的各个元素，而又不暴露其内部的表示。
 *               组合模式：组合模式允许你将对象组合成树形节后来表现“整体/部分”层次结构。组合能让客户以一致的方式处理个别对象以及对象组合。
 *
 *               原则：9.单一责任原则：一个类应该只有一个引起变化的原因，高内聚、低耦合
 *
 * @Author: chujunjie
 * @Date: Create in 11:29 2018/8/6
 * @Modified By
 */
public class IteratorAndCompositePatternDemo {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("芭比馒头菜单", "早餐供应");
        MenuComponent lunchMenu = new Menu("沙县小吃菜单", "午餐供应");
        MenuComponent dessertMenu = new Menu("美丽家", "甜品供应");

        MenuComponent allMenus = new Menu("菜单","所有菜单集合");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);

        //为每个菜单添加菜单项
        breakfastMenu.add(new MenuItem("蛋黄肉粽","嘉兴粽子",false,5));

        dessertMenu.add(new MenuItem("蛋糕","现做的",false,10));
        dessertMenu.add(new MenuItem("西瓜汁","鲜榨的",true,10));

        lunchMenu.add(new MenuItem("炒饭","扬州牌",false,15));
        lunchMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
