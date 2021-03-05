package com.example.design_pattern.principle.openclose;

/**
 * 开闭原则
 * 1、定义：对扩展开放，对修改关闭。
 * 比如本例中对继承基类javaDiscountCourse.java（javaDiscountCourse extends JavaCourse）是开放的，
 * 可以override父类中的某个接口，但是不能修改底层基类JavaCourse.java或者底层接口ICourse.java的代码，这样容易导致BUG
 *2、需求实现场景：
 * 网课示例：JavaCourse.java、ICourse.java
 * 需求更改：需要在现有基础上对价格进行打折，但是不改底层代码，需求实现javaDiscountCourse.java
 *
 * ps:小技巧
 * 1、我们把价格定义为int类型并不是错误，在非金融类项目中对货币处理时，一般取后2位精度，通常的设计方法是在运算过程中扩大
 * 100倍，在需要展示时再缩小100倍，减少精度带来的误差（设计模式之禅-开闭原则）
 */
public class test {
    public static void main(String[] args) {
        ICourse course = new javaDiscountCourse(93,"设计模式",348D);
        javaDiscountCourse javaCourse = (javaDiscountCourse) course;
        System.out.println(javaCourse.getId()+":"+javaCourse.getName()+":"+javaCourse.getPrice()+":"+javaCourse.getOriginPrice());
    }
}
