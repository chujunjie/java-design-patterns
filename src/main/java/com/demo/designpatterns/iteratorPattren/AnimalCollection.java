package com.demo.designpatterns.iteratorPattren;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 22:37 2019/1/27
 * @Modified By
 */
public interface AnimalCollection {

    AnimalCollection addAnimal(Animal animal);

    void removeAnimal(Animal animal);

    AnimalIterator getAnimalIterator();
}
