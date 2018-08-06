package com.demo.designpatterns.iteratorAndCompositePattern;

import java.util.Iterator;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 14:27 2018/8/6
 * @Modified By
 */
public interface Menu {

    void addItem(MenuItem menuItem);

    Iterator createIterator();
}
