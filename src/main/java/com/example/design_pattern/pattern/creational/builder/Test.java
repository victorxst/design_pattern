package com.example.design_pattern.pattern.creational.builder;

/**
 * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 用户只需指定需要建造的类型就可以得到它们，建造过程及细节不需要知道。
 * 类型：创建性。
 *
 * 设计模式之禅（P109)
 *
 * 在建造者模式中，有四个角色：
 *  product产品类（Course.java):通常是实现了模板方法模式。
 *  Builder抽象建造者（CourseBilder.java):规范产品的组件，定义方法。
 *  ConcreteBuilder(CourseActualBuilder.java):实现抽象类定义的所有方法，并且返回一个组建好的对象。
 *  Director导演类（Coach.java):负责安排已有模块的顺序，然后告诉Builder开始建造。
 *
 * 优点：
 *  封装性
 *  建造者独立，容易扩展
 *  便于控制细节风险
 * 缺点：
 *  产生多余的Builder对象
 *  产品内部发生变化，建造者都有修改。例如Course中增加一个属性
 *
 * 适用场景：
 *  如果一个对象有非常复杂的内部结构（很多属性）
 *  想把复杂对象的创建和使用分离
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("设计模式",
                "设计模式PPT",
                "设计模式视频",
                "设计模式手记",
                "设计模式问答");
        System.out.println(course);
    }
}
