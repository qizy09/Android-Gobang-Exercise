package com.xeonqi.gobang.model;

import com.xeonqi.gobang.datastructure.Chess;

/**
 * Created by xeon on 14-6-16.
 */
public interface ThinkingBrain {
    /**
     * if there is a winner
     * @return 0 there is no winner
     *         1 black wins
     *         2 white wins
     */
    int winnerShowsUp();

    /**
     * AI thinking
     */
    void aiThinking(boolean isPut, Chess chess);

    void makeDecision(boolean isUser);
}
