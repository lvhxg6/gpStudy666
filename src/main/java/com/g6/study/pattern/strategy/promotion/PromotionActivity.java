package com.g6.study.pattern.strategy.promotion;

/**
 * @Author hx
 * @Date 2019/3/24 6:43 PM
 * @Version 1.0
 * @Description TODO
 */

public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy strategy){
        this.promotionStrategy = strategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }

}
