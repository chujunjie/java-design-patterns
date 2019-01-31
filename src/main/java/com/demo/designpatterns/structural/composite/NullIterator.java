package com.demo.designpatterns.structural.composite;

import java.util.Iterator;

/**
 * @Description: 空迭代器，返回一个迭代器，并且这个迭代器的hasNext()永远返回false
 * @Author: chujunjie
 * @Date: Create in 22:11 2018/8/6
 * @Modified By
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
