package com.jxufe.proxy.dbroute;

import com.jxufe.proxy.dbroute.proxy.OrderServiceDynamicProxy;

public class OrderServiceDynamicProxyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime("2020");

        IOrderService service = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
        service.createOrder(order);
    }
}
