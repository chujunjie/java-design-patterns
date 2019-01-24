package com.demo.designpatterns.compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:27 2018/8/6
 * @Modified By
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    String description;

    Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Iterator createIterator() {
        return new MyCompositeIterator(menuComponents.iterator());
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.print(", " + getDescription());
        System.out.println("----------------");

        //遍历打印子菜单里面的所有菜品
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
