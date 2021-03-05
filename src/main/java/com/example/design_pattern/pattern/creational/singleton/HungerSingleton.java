package com.example.design_pattern.pattern.creational.singleton;

public class HungerSingleton {
    /**
     * 1、向外界提供，用public修饰
     * 2、自动创建，用static变量保存
     * 3、单例模式，用final修饰
     */
    public static final HungerSingleton hungerSingleton = new HungerSingleton();
    /**
     * 构造器私有化，禁止外界访问
     */
    private HungerSingleton(){
    }

    public static void doSomething(){
    }
}
