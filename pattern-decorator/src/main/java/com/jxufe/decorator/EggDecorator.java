package com.jxufe.decorator;

public class EggDecorator extends BattercakeDecorator{
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    public void doSomething() {

    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
