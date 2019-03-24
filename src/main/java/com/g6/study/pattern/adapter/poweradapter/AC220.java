package com.g6.study.pattern.adapter.poweradapter;

/**
 * @Description 原项目提供的方法
 * @Author hx
 * @Date 2019/3/24 8:03 AM
 * @Version 1.0
 */

public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电压"+output+"V");
        return output;
    }

}
