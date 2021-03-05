package com.example.design_pattern.pattern.structural.proxy.v2;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("实现的方法");
    }
}
