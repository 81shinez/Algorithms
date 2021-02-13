package com.algo.kit.sort.h_index;

import  java.util.*;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i = citations.length; i > 0; i--){
            if(citations[citations.length - i] >= i) return i;
        }
        return 0;
    }
}