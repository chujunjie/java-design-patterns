package com.demo.designpatterns.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description: 文章
 * @Author: chujunjie
 * @Date: Create in 23:24 2019/1/29
 * @Modified By
 */
@Data
@AllArgsConstructor
public class Article {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento save2Memento() {
        return new ArticleMemento(title, content, imgs);
    }

    /**
     * 从备份恢复
     * @param memento
     */
    public void backFromMemento(ArticleMemento memento) {
        this.title = memento.getTitle();
        this.content = memento.getContent();
        this.imgs = memento.getImgs();
    }
}
