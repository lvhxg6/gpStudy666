package com.g6.study.pattern.factory.abstractfactory;

/**
 * Created by huixiaolv on 18/03/2019.
 */
public interface CourseFactory {

    INote createNode();

    IVideo createVideo();

}
