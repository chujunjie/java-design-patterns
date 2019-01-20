package com.demo.designpatterns.flyweightPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:10 2019/1/20
 * @Modified By
 */
public class Manager implements Employee {

    private String title = "部门经理"; // 内部状态
    private String department; // 外部状态
    private String reportContent;

    public Manager(String department) {
        this.department = department;
        System.out.println("创建"+ department + "部门经理");
    }

    @Override
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(this.department + "的部门经理正在作报告，报告内容为: " + this.reportContent);
    }
}
