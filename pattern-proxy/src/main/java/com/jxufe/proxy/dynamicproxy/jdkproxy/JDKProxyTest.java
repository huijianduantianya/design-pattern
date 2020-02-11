package com.jxufe.proxy.dynamicproxy.jdkproxy;

import com.jxufe.proxy.Person;

import java.lang.reflect.Method;

public class JDKProxyTest {

    public static void main(String[] args) {
        try{
            Object obj = (Person) new ZhongJieJDKProxy().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj, null);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
