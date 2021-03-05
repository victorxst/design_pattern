package com.example.design_pattern.pattern.creational.singleton;


public class LazyDoubleCheckSingleton {
    /**
     *在初始化LazyDoubleCheckSingleton时，使用volatile，是为了确保生成实例的顺序
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;
    private LazyDoubleCheckSingleton(){
    }
    public static LazyDoubleCheckSingleton getInstance(){
        if(null == lazyDoubleCheckSingleton){
            synchronized(LazyDoubleCheckSingleton.class){
                if(null == lazyDoubleCheckSingleton){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
