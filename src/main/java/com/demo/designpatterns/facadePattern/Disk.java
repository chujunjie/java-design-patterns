package com.demo.designpatterns.facadePattern;

/**
 * @Description: 磁盘子系统
 * @Author: chujunjie
 * @Date: Create in 20:16 2018/8/5
 * @Modified By
 */

public class Disk {
    public void start() {
        System.out.println("Disk is start...");
    }

    public void shutDown() {
        System.out.println("Disk is shutDown...");
    }
}
