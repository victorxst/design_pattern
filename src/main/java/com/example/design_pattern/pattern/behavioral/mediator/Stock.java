package com.example.design_pattern.pattern.behavioral.mediator;

public class Stock extends AbstractColleague {
    public Stock(AbstractMediator _abstractMediator) {
        super(_abstractMediator);
    }
    //刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;

    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }

    //库存降低
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }

    //获取库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    //存货压力大了，就要通知采购人员不要采购
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        super.abstractMediator.execute("stock.clear");
    }
}
