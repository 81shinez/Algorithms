package com.algo.kit.greedy.lifeBoat;

import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        LinkedList<Integer> linkedList = new LinkedList<>();

        Arrays.sort(people);
        for(int weight : people){
            linkedList.addLast(weight);
        }

        int weight;
        while(!linkedList.isEmpty()){
            weight = linkedList.pollLast(); // 가장 무거운놈
            if(!linkedList.isEmpty()){
                if(weight + linkedList.peekFirst() <= limit){ // 가장 무거운놈과 가장 가벼운놈이 같이 탈 수 있는 경우
                    linkedList.pollFirst();
                }
            }
            answer++;
        }
        return answer;
    }
}

//import java.util.Arrays;
//
//class Solution {
//    public int solution(int[] people, int limit) {
//        int answer = 0;
//        int left = 0;
//        int right = people.length - 1;
//        Arrays.sort(people);
//        while(left < right){
//            if(people[left] + people[right] <= limit){
//                left++;
//                right--;
//            } else {
//                right--;
//            }
//            answer++;
//        }
//        if(left == right) answer++;
//        return answer;
//    }
//}