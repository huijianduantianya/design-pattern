package com.jxufe.adapter.loginadapter.adapters;


import com.jxufe.adapter.loginadapter.ResultMsg;

public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
