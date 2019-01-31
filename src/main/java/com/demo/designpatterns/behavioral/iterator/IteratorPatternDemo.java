package com.demo.designpatterns.behavioral.iterator;

/**
 * @Description: 迭代器模式：提供一种方法顺序访问一种聚合对象中的各个元素，而又不暴露其内部的表示。
 * 优点：分离集合对象的遍历行为
 * @Author: chujunjie
 * @Date: Create in 22:22 2019/1/27
 * @Modified By
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("斑马");
        Animal animal2 = new Animal("老虎");
        Animal animal3 = new Animal("狮子");
        Animal animal4 = new Animal("长颈鹿");

        MyAnimalCollection animalCollection = new MyAnimalCollection();
        animalCollection.addAnimal(animal1)
                        .addAnimal(animal2)
                        .addAnimal(animal3)
                        .addAnimal(animal4);
        printAnimal(animalCollection);

        // 去除一只动物
        System.out.println("---删除之后的动物列表---");
        animalCollection.removeAnimal(animal1);
        printAnimal(animalCollection);
    }

    private static void printAnimal(AnimalCollection animalCollection){
        AnimalIterator it = animalCollection.getAnimalIterator();
        while (!it.isLastAnimal()) {
            System.out.println(it.nextAnimal().getName());
        }
    }
}
