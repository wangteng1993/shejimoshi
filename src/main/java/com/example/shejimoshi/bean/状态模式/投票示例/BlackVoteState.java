package com.example.shejimoshi.bean.状态模式.投票示例;

public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //记入黑名单，禁止登录系统
        System.out.println("记入黑名单，将禁止登录和使用本系统！！！");
    }
}