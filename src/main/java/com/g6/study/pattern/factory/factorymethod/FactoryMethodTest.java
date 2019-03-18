package com.g6.study.pattern.factory.factorymethod;

/**
 * Created by huixiaolv on 18/03/2019.
 */
public class FactoryMethodTest {
    
    public static void main(String[] args){

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.create().record();

        new JavaCourseFactory().create().record();

    }
    
}
