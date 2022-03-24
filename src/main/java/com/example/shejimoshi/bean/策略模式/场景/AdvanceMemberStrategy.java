package com.example.shejimoshi.bean.策略模式.场景;

public class AdvanceMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("高级折扣20%");
        return booksPrice * 0.8;
    }
}
