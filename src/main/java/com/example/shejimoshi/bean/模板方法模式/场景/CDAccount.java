package com.example.shejimoshi.bean.模板方法模式.场景;

public class CDAccount extends Account{
    @Override
    protected String doCalculateAccountType() {
        return "CD ";
    }

    @Override
    protected double doCalculateAccountRate() {
        return 0.06;
    }
}
