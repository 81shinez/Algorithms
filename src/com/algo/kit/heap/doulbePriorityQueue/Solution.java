package com.algo.kit.heap.doulbePriorityQueue;


import java.util.Comparator;
import java.util.TreeSet;

class Solution {
    public int[] solution(String[] operations) {

        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 1;
            }
        });

        for(String str : operations){
            if(str.charAt(0) == 'I'){
                treeSet.add(Integer.parseInt(str.substring(2)));
            }
            if(str.charAt(0) == 'D' && !treeSet.isEmpty()){
                if(Integer.parseInt(str.substring(2)) < 0){
                    treeSet.pollLast();
                } else {
                    treeSet.pollFirst();
                }
            }
        }
        int[] nullAnswer = {0, 0};
        if (treeSet.isEmpty()) return nullAnswer;

        int[] answer = {treeSet.pollFirst(), treeSet.pollLast()};
        return answer;
    }
}