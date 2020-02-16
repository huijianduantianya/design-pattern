package com.jxufe.decorator;

public class BaseBattercake extends Battercake{
    @Override
    public String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
