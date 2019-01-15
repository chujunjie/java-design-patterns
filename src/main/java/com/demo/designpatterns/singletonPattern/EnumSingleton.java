package com.demo.designpatterns.singletonPattern;

/**
 * @Description: 枚举式单例，既可以防止反射攻击，也可以解决序列化问题
 * @Author: chujunjie
 * @Date: Create in 21:49 2019/1/13
 * @Modified By
 */
public enum EnumSingleton implements MySingleton{
    INSTANCE {
        @Override
        public void doSomething() {  //实例方法
            System.out.println("hello world");
        }
    };
    private String data; // 属性

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
