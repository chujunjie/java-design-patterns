package com.demo.designpatterns.mementoPattern;

/**
 * @Description: 备忘录模式：保存一个对象的某个状态，以便在适当的时候恢复对象
 *
 *               应用：spring的webflow StateManageableMessageContext
 * @Author: chujunjie
 * @Date: Create in 23:23 2019/1/29
 * @Modified By
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        ArticleMementoManager mementoManager = new ArticleMementoManager();
        Article article = new Article("设计模式A", "demo内容", "imgs");

        mementoManager.addMemento(article.save2Memento());
        article.setTitle("设计模式B");
        System.out.println("--恢复之前--");
        System.out.println(article);

        article.backFromMemento(mementoManager.getMemento());
        System.out.println("--恢复之后--");
        System.out.println(article);
    }
}
