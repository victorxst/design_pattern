package com.example.design_pattern.pattern.behavioral.templatemethod;

/**
 * 模板方法模式：定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变
 * 一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * AbstractClass(ACourse.java):抽象模板，分为两类
 *     1、基本方法
 *     由子类实现的方法。示例：packageCourse（）
 *     2、模板方法
 *     实现对基本方法的调度，完成固定的逻辑。示例：makeCourse（）
 *
 * 优点：
 * 1、封装不变部分，扩展可变部分
 * 2、提取公共部分代码，便于维护
 * 3、行为由父类控制，子类实现
 *
 * 缺点：
 * 1、子类执行的结果影响了父类的结果
 *
 * 使用场景：
 * 1、多个子类有公有的方法，并且逻辑基本相同时。
 * 2、重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现
 * 3、重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数（ACourse.java
 * 类中的needWriteArticle（）方法）约束其行为
 */
public class Test {
    public static void main(String[] args) {
        //后端设计模式
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();

        //前端
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
    }
}
