package com.g6.study.pattern.strategy.promotion;

/**
 * @Author hx
 * @Date 2019/3/24 6:42 PM
 * @Version 1.0
 * @Description TODO
 */

public class GroupbuyStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价");
    }
}
