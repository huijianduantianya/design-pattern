package com.jxufe.adapter.loginadapter.adapters;


import com.jxufe.adapter.loginadapter.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
