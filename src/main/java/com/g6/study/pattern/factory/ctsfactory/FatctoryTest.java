package com.g6.study.pattern.factory.ctsfactory;

/**
 * @Author hx
 * @Date 2019/3/25 10:52 PM
 * @Version 1.0
 * @Description TODO
 */

public class FatctoryTest {
    
    public static void main(String[] args){
        Factory factory = new Factory();
        Product product = factory.createProduct("bond");
        System.out.println("123");
    }
    
}
