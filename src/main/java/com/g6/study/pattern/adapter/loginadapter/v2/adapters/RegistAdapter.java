package com.g6.study.pattern.adapter.loginadapter.v2.adapters;

import com.g6.study.pattern.adapter.loginadapter.ResultMsg;

public interface RegistAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id,Object adapter);

}
