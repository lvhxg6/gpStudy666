package com.g6.study.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author hx
 * @Date 2019/3/26 10:41 PM
 * @Version 1.0
 * @Description TODO
 */

public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }

}
