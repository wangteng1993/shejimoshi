package com.example.shejimoshi.bean.策略模式.场景;

public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("中级折扣10%");
        return booksPrice * 0.9;
    }
}
