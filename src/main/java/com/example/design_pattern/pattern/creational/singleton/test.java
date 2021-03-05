package com.example.design_pattern.pattern.creational.singleton;

/**
 * 单例模式：确保某一个类中只有一个实例，而且自行实例化并向整个系统提供这个实例。
 *
 * 饥饿式：HungerSingleton.java   只要引用该类，就创建实例，每次getHungerSingleton()，都是初始化创建是实例
 * 懒汉式：LazySingleton.java   每次getInstance()，都判断是否有该实例，如果有，直接返回，如果没有，进行创建，
 * 在getInstance()中使用synchronized，是为了避免线程不安全。
 * LazyDoubleCheckSingleton.java   在初始化LazyDoubleCheckSingleton时，使用volatile，是为了确保生成实例的顺序。
 *
 * 优点：（P60）
 * 1、只生成一个实例，减少内存开支。
 * 2、避免对资源的多重占用。
 * 3、设置全局的访问，优化和共享资源访问。
 *
 * 缺点：（P60）
 * 1、没有接口，扩展困难。
 * 2、在并行开发环境中不利于测试。
 * 3、与单一职责有冲突。
 *
 * 使用场景：（P60）
 * 1、要求生成唯一序列号的环境。
 * 2、在整个项目中需要一个共享访问点或共享数据。
 * 3、创建的对象需要消耗的资源过多。
 * 4、需要定义大量的静态常量和静态方法。
 *
 * PS：使用单例模式时，要注意JVM垃圾回收机制。
 */
public class test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("end");
    }

}
