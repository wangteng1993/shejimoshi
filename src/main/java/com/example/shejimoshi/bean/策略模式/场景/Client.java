package com.example.shejimoshi.bean.策略模式.场景;

public class Client {
    public static void main(String[] args) {
        AdvanceMemberStrategy advanceMemberStrategy = new AdvanceMemberStrategy();

        Price price = new Price(advanceMemberStrategy);
        double quote = price.quote(300);
        System.out.println("价钱"+quote);

    }
}
