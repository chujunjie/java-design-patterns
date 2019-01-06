package com.demo.designpatterns.factoryPattern.factorymethod;

/**
 * @Description: 工厂方法:定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 *               对扩展开放，缺点类的膨胀。
 *
 *               应用：collection.iterator()
 *                    url更换协议族 URLStreamHandlerFactory
 *                    日志 LoggerFactory.getLogger()
 *                    spring IOC利用了工厂模式和反射机制（依赖注入）
 * @Author: chujunjie
 * @Date: Create in 21:54 2019/1/6
 * @Modified By
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        javaVideoFactory.getVideo().produce();
        PythonVideoFactory pythonVideoFactory = new PythonVideoFactory();
        pythonVideoFactory.getVideo().produce();
    }
}
