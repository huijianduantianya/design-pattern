package com.jxufe.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ZhongJieJDKProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("OK的话，准备办事");
    }

    private void before() {
        System.out.println("我是中介，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色...");
    }
}
