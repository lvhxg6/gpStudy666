package com.g6.study.pattern.adapter.loginadapter.v1;

/**
 * @Description TODO
 * @Author hx
 * @Date 2019/3/24 8:19 AM
 * @Version 1.0
 */

public class SiginForThirdServiceTest {
    
    public static void main(String[] args){
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
    
}
