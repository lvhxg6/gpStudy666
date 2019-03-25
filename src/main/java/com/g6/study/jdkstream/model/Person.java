package com.g6.study.jdkstream.model;

/**
 * @Author hx
 * @Date 2019/3/25 10:34 PM
 * @Version 1.0
 * @Description TODO
 */

public class Person {

    String name;
    Integer age;

    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[ person : name -> "+name + ",age -> " + age + "]";
    }

}
