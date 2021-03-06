package com.example.design_pattern.pattern.observer;

import javax.servlet.http.HttpServletRequest;

/**
 * 观察者模式：也叫做发布订阅模式（Publish/subscribe）,定义对象间一种一对多的依赖关系，使得每 当一个对象改变状态，
 * 则所有依赖于它的对象都会得到通知并被自动更新。
 *
 * 观察者模式包含的角色：
 * Subject被观察者：定义被观察者必须实现的职责，它必须能够动态地增加、取消观察者。它一般是抽象类 或者是实现类，
 * 仅仅完成作为被观察者必须实现的职责：管理观察者并通知观察者
 * Observer观察者：观察者接收到消息后，即进行update（更新方法）操作，对接收到的信息进行处理。
 * ConcreteSubject具体的被观察者：定义被观察者自己的业务逻辑，同时定义对哪些事件进行通知。
 *  ConcreteObserver具体的观察者:每个观察在接收到消息后的处理反应是不同，各个观察者有自己的处理逻辑。
 *
 * 优点：
 * 1、不管是增加观察者还是被观察者都非常容易扩展
 * 2、建立一套触发机制。比如：我们去打猎，打死了一只母鹿，母鹿有三个幼崽，因失去了 母鹿而饿死，尸体又被两只秃鹰争抢，
 * 因分配不均，秃鹰开始斗殴，然后羸弱的秃鹰死掉， 生存下来的秃鹰，则因此扩大了地盘……这就是一个触发机制
 * 缺点：
 * 1、开发 和调试就会比较复杂
 *
 * 使用场景：
 * 1、关联行为场景。需要注意的是，关联行为是可拆分的，而不是“组合”关系。
 * 2、事件多级触发场景。
 * 3、跨系统的消息交换场景，如消息队列的处理机制。
 *
 * 注意：
 * 且在Java中消息的通知默认是顺序执行，一个观察者卡壳，会影响 整体的执行效率。在这种情况下，一般考虑采用异步的方式。
 * 1、广播链问题：
 * 如果你做过数据库的触发器，你就应该知道有一个触发器链的问题，比如表A上写了一 个触发器，
 * 内容是一个字段更新后更新表B的一条数据，而表B上也有个触发器，要更新表 C，表C也有触发器……完蛋了，
 * 这个数据库基本上就毁掉了！我们的观察者模式也是一样 的问题，一个观察者可以有双重身份，既是观察者，
 * 也是被观察者，这没什么问题呀，但是 链一旦建立，这个逻辑就比较复杂，可维护性非常差，根据经验建议，
 * 在一个观察者模式中 最多出现一个对象既是观察者也是被观察者，也就是说消息最多转发一次（传递两次），
 * 这还是比较好控制的。
 * 2、异步问题：
 * 异步处理要考虑线程安全和队列的问题
 */
public class test {
    public static void main(String[] args) {
        //创建被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        //观察者观察被观察者
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        //观察者开始活动
        subject.doSomething();
    }
}
