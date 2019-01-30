package com.demo.designpatterns.chainofresponsibilityPattern;

/**
 * @Description: 责任链模式：为请求创建一个接收此次请求对象的链
 *
 *                 使用场景：一个请求的处理需要多个对象当中的一个或几个协作处理
 *                    优点：请求的发送者和接收者（请求的处理）解耦
 *                          责任链也可以动态组合
 *
 *                    应用：javax.servlet.Filter doFilter
 *                         spring security
 * @Author: chujunjie
 * @Date: Create in 23:05 2019/1/30
 * @Modified By
 */
public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        FormHandler titleHandler = new TitleHandler();
        FormHandler contentHandler = new ContentHandler();
        FormHandler signatureHandler = new SignatureHandler();

        Form form = new Form();
        form.setTitle("设计模式");
        form.setContent("xxx");

        titleHandler.setNextHandler(contentHandler);
        contentHandler.setNextHandler(signatureHandler);

        titleHandler.check(form);
    }
}
