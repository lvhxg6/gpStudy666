package com.g6.study.pattern.adapter.loginadapter.v1;

import com.g6.study.pattern.adapter.loginadapter.Member;
import com.g6.study.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Author hx
 * @Date 2019/3/24 8:11 AM
 * @Version 1.0
 * @Description
 *      SiginService 一般为之前版本的API，已经存在的API
 */

public class SiginService {


    public ResultMsg regist(String userName,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String userName,String password){
        return null;
    }


}
