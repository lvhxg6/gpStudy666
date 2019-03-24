package com.g6.study.pattern.adapter.loginadapter.v2;

import com.g6.study.pattern.adapter.loginadapter.ResultMsg;
import com.g6.study.pattern.adapter.loginadapter.v1.SiginService;
import com.g6.study.pattern.adapter.loginadapter.v2.adapters.*;

/**
 * @Author hx
 * @Date 2019/3/24 8:26 AM
 * @Version 1.0
 * @Description
 *      适配器模式：将一个类的方法接口转换成客户希望的另一个接口。
 *      描述 ：PassportForThirdAdapter 改版之后，新增加的API，很多功能的扩展，同时又包含之前功能的代码
 *      实现 ：提供一个接口，用户扩展API，抽出相同逻辑，代码复用
 *            继承原有类，可以访问原有类的方法
 *            抽象扩展方法的共性，各个扩展逻辑在各自类中实现
 *
 */

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {

    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    public ResultMsg loginForWechat(String id) {
        return processLogin(id,LoginForWechatAdapter.class);
    }

    public ResultMsg loginForToken(String id) {
        return processLogin(id,LoginForTokenAdapter.class);
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone,LoginForTelAdapter.class);
    }

    public ResultMsg loginForRegist(String userName, String password) {
        super.regist(userName,password);
        return super.login(userName,password);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){
        try{
            LoginAdapter loginAdapter = clazz.newInstance();

            if(loginAdapter.support(loginAdapter)){
                return loginAdapter.login(key,loginAdapter);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
