package com.example.design_pattern.pattern.creational.factorymethod;

import java.util.Collection;

/**
 * 工厂方法模式：定义一个用于创建对象的接口（VideoFactory.java），让子类决定实例化哪一个类(JavaVideoFactory.java）。工厂方法
 * 使一个类的实例化延迟到其子类。
 *
 * 抽象工厂类负责定义产品对象的产生。VideoFactory.java
 * 具体如何产生一个对象是有具体的工厂类实现的。JavaVideoFactory.java
 *
 * 优点：良好的封装性，代码结构清晰，减低模块间的耦合，扩展性好
 *
 * 案例：使用JDBC连接数据库，从MYSQL切换到Oracle，只需改一下驱动名称
 */
public class test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
