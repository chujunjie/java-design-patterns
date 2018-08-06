package com.demo.designpatterns.iteratorAndCompositePattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:54 2018/8/6
 * @Modified By
 */
public class MyCompositeIterator implements Iterator {

    Stack stack = new Stack();

    /*
    将需要遍历的顶层组合的迭代器传入，并放进一个堆栈数据结构中
    */
    public MyCompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        //想要知道是否还有下一个元素，我们检查堆栈是否被清空，如果已经空了，就表示没有下一个元素了
        if (stack.empty()) {
            return false;
        } else {
            /*
            否则我们就从堆栈的顶层中取出迭代器，看看是否还有下一个元素，
            如果它没有元素，我们将它弹出堆栈，然后递归调用hasNext()。
            */
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }

        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            //如果有下一个元素，就从堆栈中取出目前的迭代器，然后取得他的下一个元素
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            //如果元素是一个菜单，则产生了另一个需要被包含进遍历中的组合，放到堆栈中
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            //无论是不是菜单，都返回该组件
            return menuComponent;
        } else {
            return null;
        }
    }
}
