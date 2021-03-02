package com.algo.kit.dynamicProgramming.expressWithN;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    private HashSet<Integer> makeNextSet(HashMap<Integer, HashSet<Integer>> hashMap, int first, int second){
        HashSet<Integer> rtnSet = new HashSet<>();
        for(int a : hashMap.get(first)){
            for(int b : hashMap.get(second)) {
                rtnSet.add(a + b);
                rtnSet.add(a - b);
                rtnSet.add(b - a);
                rtnSet.add(a * b);
                if (b != 0) rtnSet.add(a / b);
                if (a != 0) rtnSet.add(b / a);
            }
        }
        return rtnSet;
    }

    public int solution(int N, int number) {
        int counter;
        HashMap<Integer, HashSet<Integer> > hashMap = new HashMap<>();

        if(N == number) return 1;

        int tmp = N;
        for(int idx = 1; idx < 9; idx++) {
            HashSet<Integer> hashSet = new HashSet<>();
            hashSet.add(tmp);
            hashMap.put(idx, hashSet);
            tmp = (tmp * 10) + N;
        }

        for(counter = 2; counter < 9; counter++){
            for(int idx = 1; idx <= counter/2; idx++){
                hashMap.get(counter).addAll(makeNextSet(hashMap, idx, counter - idx));
                if(hashMap.get(counter).contains(number)) return counter;
            }
        }
        return -1;
    }
}