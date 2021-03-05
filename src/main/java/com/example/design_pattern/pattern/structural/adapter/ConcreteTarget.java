package com.example.design_pattern.pattern.structural.adapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标角色实现类");
    }
}
