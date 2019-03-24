package com.g6.study.pattern.adapter.loginadapter.v2.adapters;

import com.g6.study.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Description TODO
 * @Author hx
 * @Date 2019/3/24 8:29 AM
 * @Version 1.0
 */

public class LoginForSinaAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        String msg = "sina:"+id+"登陆成功...";
        return null;
    }
}
