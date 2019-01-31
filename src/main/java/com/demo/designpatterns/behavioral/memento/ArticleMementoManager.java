package com.demo.designpatterns.behavioral.memento;

import java.util.Stack;

/**
 * @Description: 快照管理，利用Stack的先进后出获取最新快照
 * @Author: chujunjie
 * @Date: Create in 23:24 2019/1/29
 * @Modified By
 */
public class ArticleMementoManager {
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento() {
        return ARTICLE_MEMENTO_STACK.pop();
    }

    public void addMemento(ArticleMemento memento) {
        ARTICLE_MEMENTO_STACK.push(memento);
    }
}
