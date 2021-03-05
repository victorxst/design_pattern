package com.example.design_pattern.pattern.structural.decorator;

/**
 * 装饰模式：动态的给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活。
 *
 * Component(SchoolReport.java)：抽象构件，定义最核心的对象
 * ConcreteComponent(GradeSchoolReport.java)：具体构件，最核心的接口或抽象类的实现
 * Decorator(Decoratr.java)：装饰角色，实现接口或者抽象方法
 * ConcreteDecorator(SortDecorator.java/HighScoreDecorator.java):具体装饰角色，把最核心的
 * 东西装饰成其他东西。
 *
 * 优点：
 * 1、装饰类和被装饰类可以独立发展，而不会相互耦合。
 * 2、装饰模式是继承关系的一个替代方案。
 * 3、可以动态地扩展一个实现类的功能。
 *
 * 缺点：
 * 1、多层装饰比较复杂。
 *
 * 实现场景：
 * 1、需要扩展一个类的功能，或给一个类增加附加功能。
 * 2、需要动态地给一个对象增加功能，这些功能可以再动态地撤销
 * 3、需要为一批的兄弟类进行改装或者加装功能
 */
public class Test {
    public static void main(String[] args) {
        SchoolReport sr;
        sr = new GradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("张三");
    }
}
