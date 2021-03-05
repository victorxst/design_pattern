package com.example.design_pattern.pattern.structural.facade;

/**
 * 门面模式：也叫外观模式，要求一个子系统的外部与其内部的通信必须通过一个统一的门面对象进行。门面模式提供一个高层次的接口，
 * 使得子系统更易于使用。门面对象是外界访问子系统的唯一通道。
 *
 * 门面对象：GiftExchangeService.java
 * 子系统：QualifyService.java、ShippingService.java、PointsPaymentService.java
 *
 * 优点：（P284）
 * 1、减少系统的相互依赖
 * 2、提高灵活性
 * 3、提高安全性
 *
 * 缺点：（P285）
 * 1、不符合开闭原则（对修改关闭，对扩展开放）
 *
 * 使用场景：
 * 1、为一个复杂的模块或子系统系统一个供外界访问的接口。
 * 2、子系统相对独立
 * 3、预防低水平人带来风险
 *
 * PS：（实例代码P286）
 * 1、一个子系统可以有多个门面
 * 2、门面不参与系统内的业务逻辑
 */
public class test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("键盘");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
