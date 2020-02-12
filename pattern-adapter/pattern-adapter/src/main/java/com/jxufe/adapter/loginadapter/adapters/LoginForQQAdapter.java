package com.jxufe.adapter.loginadapter.adapters;


import com.jxufe.adapter.loginadapter.ResultMsg;


public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(1,"登录成功",2);
    }
}
