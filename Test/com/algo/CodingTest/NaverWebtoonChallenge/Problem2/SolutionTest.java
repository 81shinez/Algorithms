package com.algo.CodingTest.NaverWebtoonChallenge.Problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();

        StringBuilder sb = new StringBuilder();
        for(String str : solution.solution("abcxyqwertyxyabc")){
            sb.append(str + ",");
        }

        StringBuilder sb2 = new StringBuilder();
        for(String str : new String[]{"abc","xy","qwerty","xy","abc"}){
            sb2.append(str + ",");
        }

        assertEquals(sb.toString(), sb2.toString());
    }
}