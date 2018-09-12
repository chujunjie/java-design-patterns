package com.demo.designpatterns.builderPattern;

import lombok.Getter;

/**
 * @Description: 构建者模式
 * @Author: chujunjie
 * @Date: Create in 15:05 2018/9/12
 * @Modified By
 */
@Getter
public class Person {

    private String name;
    private int age;
    private boolean sex;
    private String address;

    public static class Builder {

        private String name; //必要的参数

        private int age;
        private boolean sex;
        private String address;


        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int a) {
            age = a;
            return this;
        }

        public Builder sex(boolean b) {
            sex = b;
            return this;
        }

        public Builder address(String s) {
            address = s;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.address = builder.address;
    }
}
