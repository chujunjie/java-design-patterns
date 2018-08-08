package com.demo.designpatterns.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 9:59 2018/8/8
 * @Modified By
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("setHotOrNotRating")) {
            return method.invoke(person,args);
        } else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException("您没有权限");
        } else if (method.getName().startsWith("get")) {
            return method.invoke(person,args);
        }
        return null;
    }
}
