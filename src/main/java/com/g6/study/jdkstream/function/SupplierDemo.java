package com.g6.study.jdkstream.function;

import com.g6.study.jdkstream.model.Person;

import java.util.function.Supplier;

/**
 * @Author hx
 * @Date 2019/3/25 10:36 PM
 * @Version 1.0
 * @Description
 *      Supplier的意思是供应商,那我们是不是可以把他理解成一个商场,
 *      然后你告诉他你想要的东西是什么样子的,它是不是就会给你了.
 *
 */

public class SupplierDemo {

    void testSupplier2(){
        Supplier<Person> supplier = () -> {
            Person person = new Person("huixiao",24);
            return person;
        };

        Person person = supplier.get();
        System.out.println(person);
    }

    void testSupplier3(){
        Supplier<People> supplier = new Supplier<People>() {
            @Override
            public People get() {
                People people = new People() {
                    @Override
                    public void come(Person person) {
                        System.out.println(person);
                    }
                };
                return people;
            }
        };

        People people = supplier.get();
        people.come(new Person("李四", 24));

    }

    void testSupplier4(){
        Supplier<People> supplier = () -> person -> System.out.println(person);
        People people = supplier.get();
        people.come(new Person("李四", 24));
    }


    public static void main(String[] args){
        new SupplierDemo().testSupplier2();
        new SupplierDemo().testSupplier3();
        new SupplierDemo().testSupplier4();
    }



}
