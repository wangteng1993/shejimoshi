package com.example.shejimoshi.bean.状态模式.投票示例;

public class NomalVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {

        System.out.println("恭喜投票成功");
    }
}
