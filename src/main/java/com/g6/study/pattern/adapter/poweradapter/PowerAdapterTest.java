package com.g6.study.pattern.adapter.poweradapter;

/**
 * @Description TODO
 * @Author hx
 * @Date 2019/3/24 8:08 AM
 * @Version 1.0
 */

public class PowerAdapterTest {
    
    public static void main(String[] args){
        PowerAdapter adapter = new PowerAdapter(new AC220());
        adapter.outputDC5V();
    }
    
}
