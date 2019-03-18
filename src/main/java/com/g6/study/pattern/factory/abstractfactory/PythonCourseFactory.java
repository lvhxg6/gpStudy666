package com.g6.study.pattern.factory.abstractfactory;

/**
 * Created by huixiaolv on 18/03/2019.
 */
public class PythonCourseFactory implements CourseFactory {
    public INote createNode() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
