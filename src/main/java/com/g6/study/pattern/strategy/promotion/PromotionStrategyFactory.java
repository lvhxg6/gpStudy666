package com.g6.study.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author hx
 * @Date 2019/3/24 6:45 PM
 * @Version 1.0
 * @Description
 *      策略模式概念：
 *          1、定义了算法家族，分别封装起来，让他们之间可以互相替换；
 *          2、此模式让算法的替换，不影响使用算法的用户；
 *      应用场景：
 *          1、系统中有很多类，区别仅仅是他们在统一功能中的行为不同；
 *          2、一个系统需要动态动态的在集中算法中选择一种；
 *      优势：
 *          1、减少了if else 判断，优雅代码
 *          2、符合开闭原则
 *          3、增加策略时，只需要增加策略类即可
 *      策略模式在JDK中的应用：
 *          1、Compartor比较器，作为很多类的构造参数
 *          2、比如TreeMap(Compartor compartor)，传入构造器时，compare方法使用构造器的算法进行比较
 *      策略模式在spring中的运用：
 *          1、spring中的strategy结尾的类都使用了策略模式，比如Resource实现类：SimpleInstantionStrategy,CglibSubclassingInstantiationStrategy
 *
 */

public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();

    static{
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CachebackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }


    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }


}
