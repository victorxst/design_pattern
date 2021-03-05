package com.example.design_pattern.pattern.structural.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("实现的方法");
    }
}
