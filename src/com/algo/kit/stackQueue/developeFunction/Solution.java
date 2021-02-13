package com.algo.kit.stackQueue.developeFunction;

import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answerList = new ArrayList<>();

        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> queSpeeds = new LinkedList<>();

        for(int val : progresses){
            queue.add(val);
        }

        for(int val : speeds){
            queSpeeds.add(val);
        }

        int cnt = 0;
        while (!queue.isEmpty()){
            if(queue.peek() >= 100){
                queue.poll();
                queSpeeds.poll();
                cnt++;
                if(queue.isEmpty()){
                    answerList.add(cnt);
                }
            } else {
                if(cnt > 0){
                    answerList.add(cnt);
                    cnt = 0;
                } else {
                    for(int i = 0; i < queSpeeds.size(); i++){
                        queue.set(i, queue.get(i) + queSpeeds.get(i));
                    }
                }
            }
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}