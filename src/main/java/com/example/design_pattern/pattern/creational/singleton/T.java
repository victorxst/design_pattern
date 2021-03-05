package com.example.design_pattern.pattern.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
        //LazySingleton.java运行实例
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+"   "+lazySingleton);

        //LazyDoubleCheckSingleton.java运行实例
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+"   "+lazyDoubleCheckSingleton);

        //HungerSingleton.java运行实例
        HungerSingleton hungerSingleton = HungerSingleton.hungerSingleton;
        System.out.println(Thread.currentThread().getName()+"   "+hungerSingleton);
    }
}
