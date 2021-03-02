package com.algo.kit.bruteForce.carpet;

class Solution {
    public int[] solution(int brown, int yellow) {
        int x;
        int y = 2;
        do{
            y++;
            x = brown/2 - y + 2;
        }while(x * y != (brown + yellow));
        int[] answer = new int[2];
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}