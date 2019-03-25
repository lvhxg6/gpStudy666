package com.g6.study.pattern.strategy.promotion;

public class CachebackStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现促销，返回金额转到支付宝账号");
    }
}
