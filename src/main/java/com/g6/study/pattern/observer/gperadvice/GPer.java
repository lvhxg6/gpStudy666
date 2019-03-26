package com.g6.study.pattern.observer.gperadvice;

import java.util.Observable;

/**
 * @Author hx
 * @Date 2019/3/26 10:25 PM
 * @Version 1.0
 * @Description TODO
 */

public class GPer extends Observable {

    private String name = "GPer生态圈";
    private static GPer gper = null;
    private GPer(){}

    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }
    
    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }

}
