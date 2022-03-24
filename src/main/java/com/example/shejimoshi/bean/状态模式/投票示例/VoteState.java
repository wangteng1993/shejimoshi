package com.example.shejimoshi.bean.状态模式.投票示例;

/**
 * 抽象状态类
 */
public interface VoteState {
    void vote(String user, String voteItem, VoteManager voteManager);
}
