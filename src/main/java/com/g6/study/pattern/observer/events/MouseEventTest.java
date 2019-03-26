package com.g6.study.pattern.observer.events;

import com.g6.study.pattern.observer.events.mouseevent.Mouse;
import com.g6.study.pattern.observer.events.mouseevent.MouseEventCallback;
import com.g6.study.pattern.observer.events.mouseevent.MouseEventType;

/**
 * @Author hx
 * @Date 2019/3/26 10:01 PM
 * @Version 1.0
 * @Description
 *      观察者模式
 *          定义了对象一对多模式，让多个观察者对象同时监听一个主题对象；
 *          当主题对象发送通知时，所有观察者都收到推送；
 *          也叫发布订阅模式；
 *          属于行为型设计模式
 *
 *      String中的应用：
 *          ContextLoaderListener 实现了 ServletContextListener 接口，ServletContextListener 接口又继承了 EventListener
 *
 *      优点：
 *          一对多抽象耦合
 *          支持广播通信
 *
 *      缺点：
 *          过多的数据传输细节，消耗时间
 *          不保证数据处理可靠性
 *          携代码时，注意循环广播
 */

public class MouseEventTest {

    public static void main(String[] args){

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        mouse.addListener(MouseEventType.ON_CLICK,callback);
        mouse.addListener(MouseEventType.ON_FOCUS,callback);

        mouse.click();
        mouse.focus();

    }

}
