package com.example.shejimoshi.bean.状态模式.投票示例;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类
 */
public class VoteManager {
    VoteState state;
    Map<String, String> mapVote = new HashMap<>();
    Map<String, Integer> mapVoteCount = new HashMap<>();

    /**
     * 获取用户投票结果的map
     *
     * @return 返回投票结果Map
     */
    Map<String, String> getMapVote() {
        return mapVote;
    }

    /**
     * 投票
     *
     * @param user
     * @param voteItem
     */
    void vote(String user, String voteItem) {

        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        //增加并更新投票
        oldVoteCount += 1;
        mapVoteCount.put(user, oldVoteCount);

        //判断投票的类型
        if (oldVoteCount == 1) {
            state = new NomalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepeatlVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            state=new SpiteVoteState();
        }else {
            state=new BlackVoteState();
        }
        state.vote(user,voteItem,this);
    }
}
