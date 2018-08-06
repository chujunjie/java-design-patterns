package com.demo.designpatterns.iteratorAndCompositePattern;

import java.util.Iterator;

/**
 * @Description: 菜单组件抽象类
 *               有些方法只对菜单项有效，有些只对菜单有效，所以默认实现抛出UnsupportedOperationException();
 * @Author: chujunjie
 * @Date: Create in 16:22 2018/8/6
 * @Modified By
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator createIterator();
}
