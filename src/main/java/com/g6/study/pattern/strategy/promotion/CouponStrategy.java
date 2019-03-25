package com.g6.study.pattern.strategy.promotion;

public class CouponStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("领取优惠卷，课程价格直接减优惠卷面值抵扣");
    }
}
