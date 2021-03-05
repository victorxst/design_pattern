package com.example.design_pattern.pattern.structural.adapter;

/**
 * 适配器模式：将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而
 * 无法在一起工作的两个类能够在一起工作。
 *
 * Target目标角色：该角色定义把其他类转换为我们期望的接口
 * Adaptee源角色：这个源角色，就是我们需要转换成目标角色的。
 * Adapter适配器角色：把源角色转换为目标角色，通过继承或是类关联的方式。
 *
 * 优点：
 * 1、可以让两个没有任何关系的类在一起运行
 * 2、增加了类的透明性
 * 3、提高了类的复用度
 * 4、灵活性非常好
 *
 * 使用场景：
 * 比如系统扩展了，需要使用一个已有或新建立的类，但这个类又不符合系统的接口，就需要使用适配器模式
 *
 * 扩展：
 * 本例是类适配器，在v2中讲解对象适配器
 *
 * 类适配器与对象适配器的区别：
 * 类适配器是类间继承，对象适配器是对象的合成关系，也可以说是类的关联关系。
 * ps:
 */
public class Test {
    public static void main(String[] args) {
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色后的业务逻辑
        Target target1 = new Adapter();
        target1.request();
    }
}
