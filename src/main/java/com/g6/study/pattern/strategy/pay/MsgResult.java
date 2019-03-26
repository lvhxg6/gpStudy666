package com.g6.study.pattern.strategy.pay;

/**
 * @Author hx
 * @Date 2019/3/26 9:20 PM
 * @Version 1.0
 * @Description TODO
 */

public class MsgResult {
    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString(){
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
