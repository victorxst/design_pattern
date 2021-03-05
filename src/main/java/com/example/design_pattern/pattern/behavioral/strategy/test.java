package com.example.design_pattern.pattern.behavioral.strategy;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 策略模式：定义一组算法，将每个算法都封装起来，并且使它们之间可以互换。
 * 策略模式就是采用了面向对象的继承和多态机制。
 *
 *
 * Context封装角色：屏蔽高层模块对策略、算法的直接访问
 * Strategy抽象策略角色：定义每个策略或算法必须具有的方法和属性
 * ConcreteStrategy具体策略角色：实现Strategy中的操作，该类含有具体的算法
 *
 * 优点：
 * 1、算法可以自由切换。ConcreteStrategy1和ConcreteStrategy2可以自由切换
 * 2、避免使用多重条件判断
 * 3、扩展性良好
 *
 * 缺点：
 * 1、策略类数量增多
 * 2、所有的策略类都需要对外暴露
 *
 * 使用场景：
 * 1、多个类只有在算法或行为上稍有不同的场景
 * 2、算法需要自由切换的场景
 * 3、需要屏蔽算法规则的场景
 *
 * 扩展：
 * 策略枚举
 *
 * ps:如果策略家族的具体策略数量超过4个，需要考虑私用混合模式，解决策略类膨胀和对外暴露的问题
 *
 */
public class test {
    public static void main(String[] args) {
        //声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnything();
    }
}
