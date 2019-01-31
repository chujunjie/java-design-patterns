package com.demo.designpatterns.visitorPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:28 2019/1/31
 * @Modified By
 */
public interface IVisitor {

    /**
     * 访问开源软件
     * @param software
     */
    void visit(OpenSourceSoftware software);

    /**
     * 访问付费软件
     * @param software
     */
    void visit(PaidSoftware software);
}
