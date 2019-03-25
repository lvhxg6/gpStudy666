package com.g6.study.pattern.strategy.promotion;

/**
 * @Author hx
 * @Date 2019/3/24 6:41 PM
 * @Version 1.0
 * @Description TODO
 */

public class EmptyStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
