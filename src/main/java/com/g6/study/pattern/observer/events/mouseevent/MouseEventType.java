package com.g6.study.pattern.observer.events.mouseevent;

/**
 * @Author hx
 * @Date 2019/3/26 10:15 PM
 * @Version 1.0
 * @Description TODO
 */

public interface MouseEventType {

    //单击
    String ON_CLICK = "click";

    //双击
    String ON_DOUBLE_CLICK = "doubleClick";

    //弹起
    String ON_UP = "up";

    //按下
    String ON_DOWN = "down";

    //移动
    String ON_MOVE = "move";

    //滚动
    String ON_WHEEL = "wheel";

    //悬停
    String ON_OVER = "over";

    //失焦
    String ON_BLUR = "blur";

    //获焦
    String ON_FOCUS = "focus";

}
