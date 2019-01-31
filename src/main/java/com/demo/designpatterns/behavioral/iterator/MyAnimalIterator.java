package com.demo.designpatterns.behavioral.iterator;

import java.util.List;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 22:41 2019/1/27
 * @Modified By
 */
public class MyAnimalIterator implements AnimalIterator {

    private List<Animal> list;
    private int position;

    public MyAnimalIterator(List<Animal> list) {
        this.list = list;
    }

    @Override
    public Animal nextAnimal() {
        Animal animal = list.get(position);
        position++;
        return animal;
    }

    @Override
    public boolean isLastAnimal() {
        return position >= list.size();
    }
}
