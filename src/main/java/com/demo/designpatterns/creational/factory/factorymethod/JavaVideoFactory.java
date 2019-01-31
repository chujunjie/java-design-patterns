package com.demo.designpatterns.creational.factory.factorymethod;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:52 2019/1/6
 * @Modified By
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
