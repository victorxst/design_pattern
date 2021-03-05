package com.example.design_pattern.pattern.structural.proxy.v2;

/**
 * 动态代理
 */
public class test {
    public static void main(String[] args) {
        Subject subject = (Subject) new ProxyHandler().newProxyInstance(new RealSubject());
        subject.request();
    }
}
