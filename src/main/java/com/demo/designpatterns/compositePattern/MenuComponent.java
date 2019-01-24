package com.demo.designpatterns.compositePattern;

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
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("不支持获取子节点操作");
    }

    public String getName() {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("不支持获取描述操作");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("不支持判断是否为素菜操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

    /**
     * 创建迭代器
     * @return iterator
     */
    public abstract Iterator createIterator();
}
