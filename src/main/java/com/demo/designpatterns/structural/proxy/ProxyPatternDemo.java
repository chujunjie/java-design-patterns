package com.demo.designpatterns.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * @Description: 代理模式：为另一个对象提供一个替身或占位符以访问这个对象
 * @Author: chujunjie
 * @Date: Create in 10:14 2018/8/8
 * @Modified By
 */
public class ProxyPatternDemo {
    PersonBean person;

    public static void main(String[] args) {
        ProxyPatternDemo test = new ProxyPatternDemo();
        test.drive();
    }

    public void drive(){
        PersonBean joe = new PersonBeanImpl("joe","man");

        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("tourism");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("music");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(6);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

        //检测ownerProxy对象是不是代理对象
        System.out.println(Proxy.isProxyClass(ownerProxy.getClass()));
    }


    public PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),new OwnerInvocationHandler(person));
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),new NonOwnerInvocationHandler(person));
    }
}
