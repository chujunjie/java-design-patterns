package com.demo.designpatterns.behavioral.chainofresponsibility;

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
        Article article = new Article.Builder("Effective Java").author("Joshua Bloch").content("xxx").build();
        Pipeline<Article> pipeline = new StandardPipeline<>(article);
        pipeline.setBasic(TitleValve::new)
                .addValve(AuthorValve::new)
                .addValve(ContentValve::new);
        pipeline.handle();
    }
}
