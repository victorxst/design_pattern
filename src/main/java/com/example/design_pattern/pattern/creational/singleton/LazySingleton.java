package com.example.design_pattern.pattern.creational.singleton;

/**
 * 每次getInstance()，都判断是否有该实例，如果有，直接返回，如果没有，进行创建，
 * 在getInstance()中使用synchronized，是为了避免线程不安全。
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    //限制产生多个实例
    private LazySingleton(){
    }
    //通过该方法获得对象实例
    public synchronized static LazySingleton getInstance(){
        if(null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
