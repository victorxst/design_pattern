package com.example.design_pattern.pattern.structural.proxy;

public class Proxy implements Subject {
    //要实现那个代理类
    private Subject subject = null;

    //通过构造函数传递代理者
    public Proxy(Subject subject){
        this.subject = subject;
    }
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
    //预处理
    private void before(){
        System.out.println("before do something");
    }
    //善后处理
    private void after(){
        System.out.println("after do something");
    }
}
