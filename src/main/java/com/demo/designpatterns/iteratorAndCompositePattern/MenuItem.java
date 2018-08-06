package com.demo.designpatterns.iteratorAndCompositePattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
}
