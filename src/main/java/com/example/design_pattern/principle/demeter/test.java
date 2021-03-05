package com.example.design_pattern.principle.demeter;

/**
 * 迪米特原则
 * 1、定义：一个对象应该对其它对象保持最少的了解。最少知道原则（Boss.java中调用TeamLeader的checkNumberOfCourses方法，
 * 不用知道TeamLeader中具体是怎么实现的，只需要知道他有这个方法）
 * 2、优点：降低类之间的耦合
 * 3、注意：迪米特法则要求类“羞涩”一点，尽量不要对外公布太多的public方法和非静态的
 * public变量，尽量内敛，多使用private、package-private、protected等访问权限
 */
public class test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
