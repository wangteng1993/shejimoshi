package com.example.shejimoshi.bean.状态模式.投票示例;

public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {

        String str = voteManager.getMapVote().get(user);
        if (str != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("取消投票资格");
    }
}
