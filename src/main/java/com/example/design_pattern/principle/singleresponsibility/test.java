package com.example.design_pattern.principle.singleresponsibility;

/**
 * 单一职责原则
 * 1、定义：不要存在多于一个导致类变更的原因（使职责尽量明确、单一，比如Bird.java中，既包含会飞的鸟也包含会跑的鸟，
 * 就可以拆分成两个单一的类：FlyBird.java和WalkBird.java）。一个类/接口/方法只负责一项职责
 * 2、优点：降低类的复杂度、提高类的可读性，提高系统的可维护性、降低变更引起的风险
 */
public class test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("燕子");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
