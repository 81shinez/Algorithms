package com.algo.leetCode.coinChange;

//import java.util.HashMap;
//import java.util.LinkedList;
//
//class Solution {
//    public int coinChange(int[] coins, int amount) {
//        if (amount == 0)
//            return 0;
//
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        LinkedList<Integer> nextList = new LinkedList<>();
//
//        hashMap.put(0,0);
//        nextList.add(0);
//
//        while (!nextList.isEmpty()){
//            int val = nextList.poll();
//            for(int coin : coins){
//                if(val+coin == amount) return hashMap.get(val)+1;
//                if(val+coin > amount || hashMap.containsKey(val+coin)) continue;
//                if(hashMap.containsKey(val)){
//                    hashMap.put(val+coin, hashMap.get(val)+1);
//                    nextList.addLast(val+coin);
//                }
//            }
//        }
//        return -1;
//    }
//}

import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;

        int[] amountMap = new int[amount+1];
        Arrays.fill(amountMap, Integer.MAX_VALUE);

        amountMap[0] = 0;

        for(int i = 0; i <= amount; i++) {
            if(amountMap[i] == Integer.MAX_VALUE) continue;
            int min = Integer.MIN_VALUE;
            for (int coin : coins) {
                if (coin > amount - i) continue;
                if(min == Integer.MIN_VALUE) min = amountMap[i]+1;
                else {
                    if(min < 0) min = amountMap[i]+1;
                    else if(amountMap[i] + 1 < min) min = amountMap[i] + 1;
                }
                amountMap[i+coin] = min;
            }
        }

        return amountMap[amount] == Integer.MAX_VALUE ? -1 : amountMap[amount];
    }
}