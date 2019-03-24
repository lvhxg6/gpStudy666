package com.g6.study.pattern.adapter.loginadapter.v2;

/**
 * @Description TODO
 * @Author hx
 * @Date 2019/3/24 8:40 AM
 * @Version 1.0
 */

public class PassportTest {

    public static void main(String[] args){
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("");
    }

}
