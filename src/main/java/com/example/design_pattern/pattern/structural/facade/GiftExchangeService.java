package com.example.design_pattern.pattern.structural.facade;

public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if(pointsPaymentService.pay(pointsGift)){
                //支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("下单成功，单号："+shippingOrderNo);
            }
        }
    }
}
