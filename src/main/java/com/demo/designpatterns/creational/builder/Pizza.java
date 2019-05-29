package com.demo.designpatterns.creational.builder;

import java.util.EnumSet;
import java.util.Set;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 0:02 2019/5/30
 * @Modified By
 */
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // 保护性拷贝
    }

    abstract static class Builder<T extends Builder<T>> {

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }
}
