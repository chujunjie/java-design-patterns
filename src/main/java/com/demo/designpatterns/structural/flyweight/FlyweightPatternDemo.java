package com.demo.designpatterns.structural.flyweight;

/**
 * @Description:  享元模式：提供减少对象数量从而改善应用所需的对象结构的方式，运用共享技术有效地支持大量细粒度的对象
 *                         系统底层开发，解决系统的性能问题，系统有大量相似对象，需要缓冲池的场景
 *
 *                优点：减少对象创建，降低内存中对象数量
 *                     减少内存之外的其他资源占用，比如new的系统时间占用、减少操作系统中文件句柄和窗口句柄占用
 *                缺点：需要额外关注内外部的状态问题以及线程安全问题
 *
 *                应用场景：容器单例
 *                         Integer（资源池-128~127）、String
 *                         Tomcat genericObjectPool连接池
 *
 * @Author: chujunjie
 * @Date: Create in 20:48 2019/1/20
 * @Modified By
 */
public class FlyweightPatternDemo {
    private static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Employee manager = EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
