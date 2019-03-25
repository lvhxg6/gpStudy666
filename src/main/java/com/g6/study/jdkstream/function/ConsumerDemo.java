package com.g6.study.jdkstream.function;

import com.g6.study.jdkstream.model.Person;

import java.util.function.Consumer;

/**
 * @Author hx
 * @Date 2019/3/25 10:35 PM
 * @Version 1.0
 * @Description
 *      Consumer是一个接口,所以当我们直接使用的话,要实现其 accept()方法,
 *      而这个方法的参数,就是我们定义接口时候给到的泛型,这里给的是一个String类型,
 *      方法当中的内容,就是我们所谓的消费代码,当调用accept()方法时执行.
 *
 */

public class ConsumerDemo {

    public void testConsumerAndInterfaceFunction(){
        Consumer<People> consumer = people -> {
            people.come(new Person("里斯",24));
            people.come(new Person("找钱",44));
            people.come(new Person("孙俪",14));
        };

        consumer.accept(this::print);
        //accept() accept参数类型必须是Consumer范型传递的类型
        //consumer.accept(this::pri);

    }

    public void pri(ConsumerDemo demo){
        System.out.println(demo);
    }

    public void print(Person person){
        System.out.println("person = " + person);
    }

    public static void main(String[] args){
        new ConsumerDemo().testConsumerAndInterfaceFunction();
    }

}
