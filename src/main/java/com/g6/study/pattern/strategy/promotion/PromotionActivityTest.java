package com.g6.study.pattern.strategy.promotion;

/**
 * @Author hx
 * @Date 2019/3/24 6:51 PM
 * @Version 1.0
 * @Description TODO
 */

public class PromotionActivityTest {

    public static void main(String[] args){
        new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("GROUPBUY")).execute();
    }

}
