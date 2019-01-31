package com.demo.designpatterns.structural.facade;

/**
 * @Description: 外观类
 * @Author: chujunjie
 * @Date: Create in 20:19 2018/8/5
 * @Modified By
 */
public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public ComputerFacade(CPU cpu, Memory memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void start() {
        System.out.println("Computer start begin...");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer start end...");
    }

    public void shutDown() {
        System.out.println("Computer shutDown begin...");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("Computer shutDown end...");
    }
}
