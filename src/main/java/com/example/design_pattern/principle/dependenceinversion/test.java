package com.example.design_pattern.principle.dependenceinversion;

/**
 * 依赖倒置原则
 * 1、定义：1）模块间的依赖通过抽象发生(高层模块（test.java)对底层模块（ICourse.java和JavaCourse.java)的依赖都建立在抽象（User.java）上，
 * 实现类之间不发生直接的依赖关系（JavaCourse.java和FECourse.java之间不发直接的依赖的关系），其依赖关系是通过接口或抽象类产生的；
 *          2）接口或抽象类不依赖于实现类（ICourse.java和User.java不依赖于JavaCourse.java)
 *          3）实现类依赖接口或抽象类(JavaCourse.java依赖于ICourse.java和User.java实现
*  2、依赖的三种写法（设计模式之禅-25页）
 *      1）构造函数传递依赖对象
 *      2）Setter方法传递依赖对象
 *      3）接口声明依赖对象
 * 3、优点：
 * 减少类间的耦合性，提高系统的稳定性，降低并行开发引起的风险，提高代码的可读性和可维护性
*
 *  ps:注意
 *  1、父类可以出现的地方，子类都可以出现；子类出现的地方，父类不一定可以出现
 */
public class test {
    public static void main(String[] args) {
        User user = new User();
        user.setiCourse(new JavaCourse());
        user.studyImoocCourse();

        user.setiCourse(new FECourse());
        user.studyImoocCourse();
    }
}
