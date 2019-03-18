package com.g6.study.pattern.factory.simplefactory;

import com.g6.study.pattern.factory.ICourse;

/**
 * Created by huixiaolv on 18/03/2019.
 *
 *
 * 简单工厂模式：
 *      由一个工厂对象决定创建出哪一种产品类的实例。创建型模式。
 *
 */
public class CourseFactory {

//    public ICourse create(String name){
//        if("Java".equals(name)){
//            return new JavaCourse();
//        }else if("Python".equals(name)){
//            return new PythonCourse();
//        }else{
//            return null;
//        }
//    }

//    public ICourse create(String clazzName) {
//        try {
//            if (!(null == clazzName || "".equals(clazzName))) {
//                return (ICourse) Class.forName(clazzName).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if(null!=clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
