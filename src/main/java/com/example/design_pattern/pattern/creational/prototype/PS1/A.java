package com.example.design_pattern.pattern.creational.prototype.PS1;

public class A implements Cloneable {
    public A(){
        System.out.println("构造函数被执行");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        A a = null;
        a = (A) super.clone();
        return a;
    }
}
