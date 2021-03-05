package com.example.design_pattern.pattern.behavioral.mediator;

import java.util.Random;

public class Sale extends AbstractColleague {
    public Sale(AbstractMediator _abstractMediator) {
        super(_abstractMediator);
    }

    //销售电脑
    public void sellComputer(int number){
        super.abstractMediator.execute("sale.sell",number);
        System.out.println("销售电脑"+number);
    }
    //反馈销售情况，0~100变化
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("电脑销售情况："+saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offSale(){
        super.abstractMediator.execute("sale.offsell");
    }
}
