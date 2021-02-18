package com.algo.kit.stackQueue.printer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        LinkedList<Integer> prioList = new LinkedList<>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int priority : priorities){
            prioList.add(priority);
            pQueue.add(priority);
        }

        int answer = location;
        int counter = 1;
        while (!prioList.isEmpty()){
            if(prioList.peekFirst() < pQueue.peek()){
                prioList.addLast(prioList.pollFirst());
                if(answer == 0){
                    answer = prioList.size() - 1;
                } else {
                    answer--;
                }
            } else {
                if(answer == 0){
                    return counter;
                }
                prioList.poll();
                pQueue.poll();
                counter++;
                if(answer == 0){
                    answer = prioList.size() - 1;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }
}