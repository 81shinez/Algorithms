package com.algo.kit.greedy.traingSuit;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] students = new int[n];

        for(int i = 0; i < students.length; i++){
            students[i] = 1;
        }

        for(int i = 0; i < lost.length; i++){
            lost[i]--;
        }

        for(int i = 0; i < reserve.length; i++){
            reserve[i]--;
        }

        for(int i : lost){
            students[i]--;
        }

        for(int i : reserve){
            students[i]++;
        }

        for(int idx = 0; idx<students.length; idx++){
            if(students[idx] == 2){
                if(idx != 0) {
                    if (students[idx - 1] == 0) {
                        students[idx - 1]++;
                        students[idx]--;
                        continue;
                    }
                }
                if(idx != n-1){
                    if(students[idx+1] == 0){
                        students[idx + 1]++;
                        students[idx]--;
                        continue;
                    }
                }
            }
        }

        for(int num : students){
            if(num >= 1) answer++;
        }

        return answer;
    }
}