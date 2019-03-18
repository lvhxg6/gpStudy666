package com.g6.study.pattern.factory.abstractfactory;

/**
 * Created by huixiaolv on 18/03/2019.
 */
public class JavaCourseFactory implements CourseFactory {
    public INote createNode() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
