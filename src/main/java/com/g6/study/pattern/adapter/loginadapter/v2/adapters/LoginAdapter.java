package com.g6.study.pattern.adapter.loginadapter.v2.adapters;

import com.g6.study.pattern.adapter.loginadapter.ResultMsg;

public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id,Object adapter);

}
