package com.demo.designpatterns.iteratorPattren;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 22:39 2019/1/27
 * @Modified By
 */
public class MyAnimalCollection implements AnimalCollection {

    private List<Animal> animalList;

    public MyAnimalCollection() {
        this.animalList = new ArrayList<>();
    }

    @Override
    public MyAnimalCollection addAnimal(Animal animal) {
        animalList.add(animal);
        return this;
    }

    @Override
    public void removeAnimal(Animal animal) {
        animalList.remove(animal);
    }

    @Override
    public AnimalIterator getAnimalIterator() {
        return new MyAnimalIterator(animalList);
    }
}
