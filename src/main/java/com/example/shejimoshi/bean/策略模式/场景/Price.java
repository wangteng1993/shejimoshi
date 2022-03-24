package com.example.shejimoshi.bean.策略模式.场景;

public class Price {
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    double quote(double booksPrice) {
        return this.memberStrategy.calcPrice(booksPrice);

    }
}
