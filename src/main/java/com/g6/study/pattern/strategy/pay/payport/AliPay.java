package com.g6.study.pattern.strategy.pay.payport;

/**
 * @Author hx
 * @Date 2019/3/26 9:24 PM
 * @Version 1.0
 * @Description TODO
 */

public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
