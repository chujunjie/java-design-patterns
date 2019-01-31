package com.demo.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: Employee工厂，需要关注线程安全问题
 * @Author: chujunjie
 * @Date: Create in 21:12 2019/1/20
 * @Modified By
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Employee manager = EMPLOYEE_MAP.get(department);
        if (!(manager instanceof Manager)) {
            manager = new Manager(department);
            String reportContent = "xxx";
            manager.setReportContent(reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
