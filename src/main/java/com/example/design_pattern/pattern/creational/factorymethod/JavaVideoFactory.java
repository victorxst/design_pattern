package com.example.design_pattern.pattern.creational.factorymethod;

/**
 * 具体如何产生一个对象是有具体的工厂类实现的。
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
