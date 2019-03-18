package com.g6.study.pattern.factory.abstractfactory;

/**
 * Created by huixiaolv on 18/03/2019.
 */
public class AbstractFactoryTest {
    
    
    public static void main(String[] args){
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNode().edit();
        javaCourseFactory.createVideo().record();
    }
    
}
