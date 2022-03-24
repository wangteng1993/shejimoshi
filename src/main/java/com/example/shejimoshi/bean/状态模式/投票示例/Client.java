package com.example.shejimoshi.bean.状态模式.投票示例;

public class Client {
    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        for (int i = 0; i < 100; i++) {
            voteManager.vote("Sschen","A");
        }
    }
}
