package com.jxufe.proxy.dbroute.proxy;

import com.jxufe.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj =  method.invoke(this.target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("Proxy after method");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    private void before(Object target) {
        try{
            //进行数据源的切换
            System.out.println("Proxy before method");
            //约定优于配置
            String createTime = (String)target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(createTime);
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
