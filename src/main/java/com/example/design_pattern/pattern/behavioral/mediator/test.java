package com.example.design_pattern.pattern.behavioral.mediator;

/**
 * 中介者模式：用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互
 * 作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * 优势：
 * 减少类间的依赖，把原有的一对多的依赖变成了一对一的依赖
 *
 * 缺点：
 * 逻辑复杂，原来N个对象直接的相互依赖关系转换为中介者和同事类的依赖关系，同事类越多，
 * 中介者的逻辑就越复杂。
 *
 * 使用场景：
 *
 */
public class test {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("---------采购电脑---------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);
        System.out.println("---------销售电脑---------");
        Sale sale = new Sale(mediator);
        sale.sellComputer(1);
        System.out.println("---------清库处理----------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
