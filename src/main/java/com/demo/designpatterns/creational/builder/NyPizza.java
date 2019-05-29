package com.demo.designpatterns.creational.builder;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 0:13 2019/5/30
 * @Modified By
 */
public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    private NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
