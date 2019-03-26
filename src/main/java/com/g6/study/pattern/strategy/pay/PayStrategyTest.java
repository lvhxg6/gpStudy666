package com.g6.study.pattern.strategy.pay;

import com.g6.study.pattern.strategy.pay.payport.PayStrategy;

/**
 * @Author hx
 * @Date 2019/3/26 9:32 PM
 * @Version 1.0
 * @Description TODO
 */

public class PayStrategyTest {
    
    public static void main(String[] args){
        Order order = new Order("1", "20180311001000009", 32.34);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
    
}
