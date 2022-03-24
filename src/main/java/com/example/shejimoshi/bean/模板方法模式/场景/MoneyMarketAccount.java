package com.example.shejimoshi.bean.模板方法模式.场景;

public class MoneyMarketAccount  extends Account{
    @Override
    protected String doCalculateAccountType() {
        return "Monkey Market";
    }

    @Override
    protected double doCalculateAccountRate() {
        return 0.045;
    }
}
