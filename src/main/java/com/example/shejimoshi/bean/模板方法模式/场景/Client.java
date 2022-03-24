package com.example.shejimoshi.bean.模板方法模式.场景;

public class Client {
    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("monkey "+account.calculateInterest());


        Account cdAccount = new CDAccount();
        System.out.println("CD "+cdAccount.calculateInterest());
    }
}
