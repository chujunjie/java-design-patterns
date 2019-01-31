package com.demo.designpatterns.behavioral.visitor;

/**
 * @Description: 访问者，也可以创建不同的访问者对同一个访问对象产生不同的访问结果
 * @Author: chujunjie
 * @Date: Create in 21:35 2019/1/31
 * @Modified By
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(OpenSourceSoftware software) {
        System.out.println("开源软件: " + software.getName());
    }

    @Override
    public void visit(PaidSoftware software) {
        System.out.println("付费软件：" + software.getName() + "，价格为：" + software.getPrice());
    }
}
