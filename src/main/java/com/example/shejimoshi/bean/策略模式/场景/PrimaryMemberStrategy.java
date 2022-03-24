package com.example.shejimoshi.bean.策略模式.场景;

public class PrimaryMemberStrategy implements MemberStrategy  {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("初级无折扣");
        return booksPrice;
    }
}
