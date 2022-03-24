package com.example.shejimoshi.bean.状态模式.投票示例;

public class RepeatlVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {

        System.out.println("请不要重复投票");
    }
}
