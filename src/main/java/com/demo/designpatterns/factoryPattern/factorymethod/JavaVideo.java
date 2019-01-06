package com.demo.designpatterns.factoryPattern.factorymethod;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:50 2019/1/6
 * @Modified By
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("正在录制java视频");
    }
}
