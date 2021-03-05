package com.example.design_pattern.pattern.behavioral.strategy;

public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {

        System.out.println("具体策略1的运算法则");
    }
}
