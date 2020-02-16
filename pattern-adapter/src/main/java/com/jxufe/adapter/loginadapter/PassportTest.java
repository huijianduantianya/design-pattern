package com.jxufe.adapter.loginadapter;

public class PassportTest {
    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        System.out.println(passportForThird.loginForQQ("1"));;


    }
}
