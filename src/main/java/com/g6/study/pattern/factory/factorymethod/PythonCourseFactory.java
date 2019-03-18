package com.g6.study.pattern.factory.factorymethod;

import com.g6.study.pattern.factory.ICourse;
import com.g6.study.pattern.factory.PythonCourse;

/**
 * Created by huixiaolv on 18/03/2019.
 */
public class PythonCourseFactory implements ICourseFactory{
    public ICourse create() {
        return new PythonCourse();
    }
}
