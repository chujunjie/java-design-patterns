package com.demo.designpatterns.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Description: 文章快照，不开放Setter
 * @Author: chujunjie
 * @Date: Create in 23:24 2019/1/29
 * @Modified By
 */
@Getter
@ToString
@AllArgsConstructor
public class ArticleMemento {

    private String title;
    private String content;
    private String imgs;
}
