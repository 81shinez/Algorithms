package com.algo.kit.bfs_dfs.targetNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        assertEquals(solution.solution(new int[]{1,1,1,1,1}, 3), 5);
    }
}