package com.example.design_pattern.pattern.creational.prototype.PS1;

public class B {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();
        A aClone = (A) a.clone();
    }
}
