package com.example.design_pattern.pattern.behavioral.mediator;

public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if(str.equalsIgnoreCase("purchase.buy")){
            this.buyComputer((Integer) objects[0]);
        }else if(str.equalsIgnoreCase("sale.sell")){
            this.sellComputer((Integer) objects[0]);
        }else if(str.equalsIgnoreCase("sale.offsell")){
            this.offSell();
        }else if(str.equalsIgnoreCase("stock.clear")){
            this.clearStock();
        }
    }

    //采购电脑
    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus>80){//销售情况良好
            System.out.println(("采购电脑："+number));
            super.stock.increase(number);
        }else{
            int buyNumber = number/2;
            System.out.println("折半采购："+buyNumber);
            super.stock.increase(buyNumber);
        }
    }

    //销售电脑
    private void sellComputer(int number){
        if(super.stock.getStockNumber()<number){//库存数量不够销售
            super.purchase.buyComputer(number);
        }
        super.stock.decrease(number);
    }

    //折半销售电脑
    private void offSell(){
        System.out.println("折价销售电脑"+stock.getStockNumber());
    }

    //清仓处理
    private void clearStock(){
        //清仓销售
        super.sale.offSale();
        //采购人员不要采购
        super.purchase.refuseBuyComputer();
    }
}
