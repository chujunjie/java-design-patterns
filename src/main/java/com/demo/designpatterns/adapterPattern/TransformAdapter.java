package com.demo.designpatterns.adapterPattern;

/**
 * @Description: 适配器（转换器）
 * @Author: chujunjie
 * @Date: Create in 18:11 2018/8/5
 * @Modified By
 */
public class TransformAdapter implements Duck{

    Turkey turkey;

    public TransformAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
