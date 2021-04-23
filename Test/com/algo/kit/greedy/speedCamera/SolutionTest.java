package com.algo.kit.greedy.speedCamera;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        assertEquals(solution.solution(new int[][]{{-20,15}, {-15,-5}, {-18,-13}, {-5,-3}}), 2);
    }
}