package com.demo.designpatterns.iteratorAndCompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:27 2018/8/6
 * @Modified By
 */
public class Menu extends MenuComponent{

    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
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
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------");

        //遍历打印子菜单里面的所有菜品
        Iterator<MenuComponent> menuComponentIterator = menuComponents.iterator();
        while (menuComponentIterator.hasNext()) {
            MenuComponent menuComponent = menuComponentIterator.next();
            menuComponent.print();
        }
    }
}
