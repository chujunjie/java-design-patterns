package com.demo.designpatterns.compositePattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Iterator;

/**
 * @Description: 菜单项目
 * @Author: chujunjie
 * @Date: Create in 11:30 2018/8/6
 * @Modified By
 */
@Setter
@Getter
@AllArgsConstructor
@ToString
public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.print(", " + getPrice());
        System.out.println("     ---" + getDescription());
    }
}
