package com.demo.designpatterns.creational.singleton;

/**
 * @Description: 枚举式单例，既可以防止反射攻击，也可以解决序列化问题
 * @Author: chujunjie
 * @Date: Create in 21:49 2019/1/13
 * @Modified By
 */
public enum EnumSingleton implements MySingleton {

    /* 单例 */
    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("hello world");
        }
    };

    // 属性
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
