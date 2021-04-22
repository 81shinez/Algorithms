package com.algo.kit.greedy.connectIslands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
//        assertEquals(solution.solution(4, new int[][]{{0,1,1}, {0,2,2}, {1,2,5}, {1,3,1}, {2,3,8}}), 4);
        assertEquals(solution.solution(4, new int[][]{{0,1,1}, {0,2,2}, {1,2,5}, {1,3,1}, {2,3,8}, {0,3,1}}), 4);
    }
}