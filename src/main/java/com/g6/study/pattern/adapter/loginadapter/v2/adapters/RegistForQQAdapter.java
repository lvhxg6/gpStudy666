package com.g6.study.pattern.adapter.loginadapter.v2.adapters;

import com.g6.study.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Description TODO
 * @Author hx
 * @Date 2019/3/24 8:33 AM
 * @Version 1.0
 */

public class RegistForQQAdapter implements RegistAdapter{

    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
