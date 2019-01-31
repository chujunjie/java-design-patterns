package com.demo.designpatterns.creational.prototype;

/**
 * @Description: 原型模式
 *               适用场景：1.类初始化消耗较多资源
 *                        2.new产生一个对象需要繁琐的过程（数据准备，访问权限等）
 *                        3.构造函数复杂
 *                        4.循环体内产生大量对象
 *               优点：比直接new对象性能高、简化创建过程
 *               缺点：必须重写克隆方法、在深浅拷贝时需要留意
 *               应用：集合类
 * @Author: chujunjie
 * @Date: Create in 23:33 2019/1/16
 * @Modified By
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        MailUtil.saveOrginalMailRecord(mail);

        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("同学" + i);
            mailTemp.setAddress("同学" + i + "@hotmail.com");
            mailTemp.setContent("周五测试");
            MailUtil.sendMail(mailTemp);
        }

        MailUtil.saveOrginalMailRecord(mail);
    }
}
