package com.g6.study.pattern.factory.simplefactory;

import com.g6.study.pattern.factory.ICourse;
import com.g6.study.pattern.factory.JavaCourse;
import com.g6.study.pattern.factory.PythonCourse;

/**
 * Created by huixiaolv on 18/03/2019.
 */
public class SimpleFactoryTest {
    
    public static void main(String[] args){
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.record();


//        ICourse python = new CourseFactory().create("Python");
//        python.record();

//        ICourse python = new CourseFactory().create("com.g6.study.pattern.factory.JavaCourse");
//        python.record();

        ICourse iCourse = new CourseFactory().create(PythonCourse.class);
        iCourse.record();

    }
    
}
