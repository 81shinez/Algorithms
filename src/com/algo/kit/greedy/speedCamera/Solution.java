package com.algo.kit.greedy.speedCamera;

import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;

        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);

        int exit = routes[0][1];

        for(int idx = 1; idx < routes.length; idx++){
            if(routes[idx][0] > exit) {
                exit = routes[idx][1];
                answer++;
            }
        }

        return answer;
    }
}