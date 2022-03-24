package com.example.shejimoshi.bean.模板方法模式.场景;

public abstract class Account {
    /**
     * 模板方法计算利息
     */
    public final double calculateInterest() {
        double v = doCalculateAccountRate();
        String s = doCalculateAccountType();
        double v1 = calculateAmount(s);
        return v * v1;
    }

    protected abstract String doCalculateAccountType();

    protected abstract double doCalculateAccountRate();

    double calculateAmount(String accountType) {
        return 123.00;
    }
}
