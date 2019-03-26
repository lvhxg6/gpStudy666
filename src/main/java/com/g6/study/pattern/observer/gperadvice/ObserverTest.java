package com.g6.study.pattern.observer.gperadvice;

/**
 * @Author hx
 * @Date 2019/3/26 10:28 PM
 * @Version 1.0
 * @Description
 *      基于JDK实现观察者模式
 *          事件继承Observable类，提供事件处理方法，方法中调用setChanged()、notifyObservers()方法
 *          监听者实现Observer接口，当有事件发生的时候，接口中的update方法就会被调用。
 *
 */

public class ObserverTest {
    
    public static void main(String[] args){
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");


        //这为没有@Tom老师
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");

        gper.addObserver(tom);
        gper.addObserver(mic);
        gper.publishQuestion(question);

    }
    
}
