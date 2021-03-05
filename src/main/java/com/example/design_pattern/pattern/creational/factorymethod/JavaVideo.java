package com.example.design_pattern.pattern.creational.factorymethod;
/**
 * JavaVideo是实现类，完成具体的工作。
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("Java视频");
    }
}
