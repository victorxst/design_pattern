package com.example.design_pattern.principle.interfacesegregation;

/**
 * 接口隔离原则
 * 1、定义：用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口
 *
 * 2、优点：符合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性、可扩展性和可维护性
 *
 * 3、接口隔离原则与单一职责原则的不同：单一职责原则要求的是类和接口职责单一，注重的是职责，
 * 这是业务逻辑上的划分；二接口隔离原则要求接口的方法尽量少
 * ps:注意：该原则使用一定要适度
 */
public class Dogtest implements IEatAnimalAction,ISwimAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
