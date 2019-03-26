package com.g6.study.pattern.strategy.pay.payport;

/**
 * @Author hx
 * @Date 2019/3/26 9:26 PM
 * @Version 1.0
 * @Description TODO
 */

public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 23;
    }
}
