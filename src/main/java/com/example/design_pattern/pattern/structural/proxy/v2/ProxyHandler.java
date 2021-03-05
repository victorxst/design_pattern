package com.example.design_pattern.pattern.structural.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
    Object obj = null;
    public Object newProxyInstance(Object realObj){
        this.obj = realObj;
        Class<?> classType = this.obj.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.print("I'm Proxy, I'm invoking...");
        method.invoke(obj, objects);
        System.out.println("invoke end!");
        return null;
    }
}
