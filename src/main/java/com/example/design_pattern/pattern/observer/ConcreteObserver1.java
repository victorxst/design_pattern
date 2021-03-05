package com.example.design_pattern.pattern.observer;

public class ConcreteObserver1 implements Observer {
    //实现更新方法
    @Override
    public void update() {
        System.out.println("ConcreteObserver1接收到通知，进行处理！");
    }
}
