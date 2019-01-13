package com.demo.designpatterns.singletonPattern;

/**
 * @Description: 枚举式单例，既可以防止反射攻击，也可以解决序列化问题
 * @Author: chujunjie
 * @Date: Create in 21:49 2019/1/13
 * @Modified By
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
