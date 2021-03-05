package com.example.design_pattern.pattern.behavioral.mediator;

public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _abstractMediator) {
        super(_abstractMediator);
    }
    //采购电脑
    public void buyComputer(int number){
        super.abstractMediator.execute("purchase.buy",number);
    }
    //不采购电脑
    public void refuseBuyComputer(){
        System.out.println("不再采购电脑");
    }
}
