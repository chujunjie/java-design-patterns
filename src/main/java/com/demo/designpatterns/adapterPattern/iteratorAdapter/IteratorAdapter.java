package com.demo.designpatterns.adapterPattern.iteratorAdapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Description:  迭代器适配到枚举器
 * @Author: chujunjie
 * @Date: Create in 19:07 2018/8/5
 * @Modified By
 */
public class IteratorAdapter implements Iterator {

    Enumeration enumeration;

    public IteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
