package com.g6.study.pattern.adapter.poweradapter;

/**
 * @Description TODO
 * @Author hx
 * @Date 2019/3/24 8:06 AM
 * @Version 1.0
 */

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220){
            this.ac220 = ac220;
        }

        public int outputDC5V() {
            int adapterInput = ac220.outputAC220V();
            int adapterOutput = adapterInput / 44;
            System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V,输出DC：" + adapterOutput + "V");
            return 0;
    }
}
