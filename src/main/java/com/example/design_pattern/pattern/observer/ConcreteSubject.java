package com.example.design_pattern.pattern.observer;

public class ConcreteSubject extends Subject {
    //具体的业务
    public void doSomething(){
        super.notifyObservers();
    }
}
