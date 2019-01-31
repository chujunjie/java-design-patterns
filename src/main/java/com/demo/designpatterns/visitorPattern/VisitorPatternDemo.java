package com.demo.designpatterns.visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 访问者模式：封装作用于某数据结构（如List/Set/Map等）中的各元素操作
 *
 *                适用场景：一个数据结构（如List/Set/Map等）包含很多类型对象
 *                         且有数据结构与数据操作相分离的需求
 *
 *                   应用：JDK FileVisitor
 *                         spring BeanDefinitionVisitor
 * @Author: chujunjie
 * @Date: Create in 21:15 2019/1/31
 * @Modified By
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        OpenSourceSoftware openSourceSoftware = new OpenSourceSoftware();
        openSourceSoftware.setName("eclipse");

        PaidSoftware paidSoftware = new PaidSoftware();
        paidSoftware.setName("IntelliJ IDEA");
        paidSoftware.setPrice(998D);

        List<Software> list = new ArrayList<>();
        list.add(openSourceSoftware);
        list.add(paidSoftware);

        IVisitor visitor = new Visitor();
        list.forEach(software -> software.accept(visitor));
    }
}
