package com.demo.designpatterns.chainofresponsibilityPattern;

/**
 * @Description: form表单处理者
 * @Author: chujunjie
 * @Date: Create in 23:12 2019/1/30
 * @Modified By
 */
public abstract class FormHandler {

    protected FormHandler handler;

    public void setNextHandler(FormHandler handler) {
        this.handler = handler;
    }

    public abstract void check(Form form);
}
