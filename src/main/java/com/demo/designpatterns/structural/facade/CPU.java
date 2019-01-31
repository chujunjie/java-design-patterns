package com.demo.designpatterns.structural.facade;

/**
 * @Description: cpu子系统
 * @Author: chujunjie
 * @Date: Create in 20:13 2018/8/5
 * @Modified By
 */
public class CPU {

    public void start() {
        System.out.println("cpu is start...");
    }

    public void shutDown() {
        System.out.println("CPU is shutDown...");
    }
}
