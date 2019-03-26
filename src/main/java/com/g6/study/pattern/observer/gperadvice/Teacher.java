package com.g6.study.pattern.observer.gperadvice;

import javafx.beans.Observable;

import java.util.Observer;

/**
 * @Author hx
 * @Date 2019/3/26 10:27 PM
 * @Version 1.0
 * @Description TODO
 */

public class Teacher implements Observer {

    private String name;
    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        GPer gper = (GPer)o;
        Question question = (Question)arg;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
