package com.demo.designpatterns.behavioral.chainofresponsibility;

import lombok.Getter;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:26 2019/7/2
 * @Modified By
 */
@Getter
public class Article {
    private String title;
    private String author;
    private String content;

    private Article(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
    }

    public static class Builder {
        private String title;
        private String author = null;
        private String content = null;

        public Builder(String title) {
            this.title = title;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Article build() {
            return new Article(this);
        }
    }
}
