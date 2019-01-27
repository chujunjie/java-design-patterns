package com.demo.designpatterns.iteratorPattren;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 22:39 2019/1/27
 * @Modified By
 */
public interface AnimalIterator {

    Animal nextAnimal();

    boolean isLastAnimal();
}
