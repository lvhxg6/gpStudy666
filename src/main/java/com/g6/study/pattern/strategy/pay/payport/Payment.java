package com.g6.study.pattern.strategy.pay.payport;

import com.g6.study.pattern.strategy.pay.MsgResult;

/**
 * @Author hx
 * @Date 2019/3/26 9:22 PM
 * @Version 1.0
 * @Description TODO
 */

public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid,double amount){

        if(queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额："+amount);

    }


}
