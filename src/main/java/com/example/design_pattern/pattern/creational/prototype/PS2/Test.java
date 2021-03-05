package com.example.design_pattern.pattern.creational.prototype.PS2;

/**
 * 浅拷贝：Object类提供的clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，
 * 还是指向原生对象的内部元素地址。
 *
 * 深拷贝：完全拷贝，两个对象之间没有任何瓜葛，互不影响。
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝
//        ShallowCopy shallowCopy = new ShallowCopy();
//        shallowCopy.setVlue("张三");
//        ShallowCopy scClone = (ShallowCopy) shallowCopy.clone();
//        scClone.setVlue("李四");
//        System.out.println(shallowCopy.getValue());

        //深拷贝
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setVlue("张三");
        DeepCopy dcClone = (DeepCopy) deepCopy.clone();
        dcClone.setVlue("李四");
        System.out.println(deepCopy.getValue());
    }

}
