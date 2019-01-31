package com.demo.designpatterns.creational.builder;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @Description: 构建者模式，可以有多个可变参数
 *               为了创建对象，必须先创建它的构造器，所以会带来性能损失
 *
 *               应用：StringBuilder StringBuffer
*                     Guava 不可变set ImmutableSet 、CacheBuilder
 *                    spring BeanDefinitionBuilder
 *                    mybatis SqlSessionFactoryBuilder包装XMLConfigBuilder
 * @Author: chujunjie
 * @Date: Create in 15:16 2018/9/12
 * @Modified By
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Person person = new Person.Builder("xiaoming").age(20).sex(true).address("hangzhou").build();
        System.out.println(person);

        Set<String> immutableSet = ImmutableSet.<String>builder().add("hello").add("world").build();
        System.out.println(immutableSet);
    }
}
