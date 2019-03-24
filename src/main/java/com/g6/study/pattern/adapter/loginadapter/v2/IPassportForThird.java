package com.g6.study.pattern.adapter.loginadapter.v2;

import com.g6.study.pattern.adapter.loginadapter.ResultMsg;

public interface IPassportForThird {

    ResultMsg loginForQQ(String id);

    ResultMsg loginForWechat(String id);

    ResultMsg loginForToken(String id);

    ResultMsg loginForTelphone(String telphone,String code);

    ResultMsg loginForRegist(String userName,String password);


}
