package com.demo.designpatterns.structural.composite;

import java.util.Iterator;

/**
 * @Description: 午餐菜单
 * @Author: chujunjie
 * @Date: Create in 13:41 2018/8/6
 * @Modified By
 */
public class LunchMenuIterator implements Iterator {

    private MenuItem[] items;
    private int position = 0;  //记录当前数组遍历的位置

    //构造器需要被传入一个菜单项的数组当做参数。
    LunchMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    /*
    检查我们是否已经取得数组内所有的元素，如果还有元素待遍历，则返回true
    因为使用的是固定长度的数组，所以我们不但要检查是都超出了数组长度也必须检查是否下一项是null，
    如果是null，就表示没有其他项了。
     */
    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position ++;
        return menuItem;
    }
}
