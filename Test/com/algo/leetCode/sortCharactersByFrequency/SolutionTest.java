package com.algo.leetCode.sortCharactersByFrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void frequencySort() {
        Solution solution = new Solution();
        String str = "tree";
        System.out.println(solution.frequencySort(str));
    }
}