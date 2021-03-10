package com.algo.kit.greedy.joyStick;

class Solution {
    int cnt = 0;

    int findClosest(int strPointer, String name){
        if(name.charAt(strPointer) != 'A') return 0;
        int left = strPointer;
        int right = strPointer;
        for(int i = 0; i < name.length() / 2 + 1; i++){
            cnt++;
            if(right == name.length() - 1) right = 0;
            else right++;
            if(name.charAt(right) != 'A') return right;
            if(left == 0) left = name.length() - 1;
            else left--;
            if(name.charAt(left) != 'A') return left;
        }
        return -1;
    }

    int countChar(char nameChar){
        if(nameChar == 'N') return 13;
        if(nameChar > 'N') return ('Z' + 1 - nameChar);
        if(nameChar < 'N') return (nameChar - 'A');
        return 0;
    }

    public int solution(String name) {
        int answer = 0;
        int strPointer = 0;

        cnt = 0;

        while(strPointer != -1){
            cnt = 0;
            strPointer = findClosest(strPointer, name);
            if(strPointer == -1) break;
            else answer += countChar(name.charAt(strPointer));
            name = name.substring(0, strPointer).concat("A").concat(name.substring(strPointer+1));
            if(strPointer != -1) {
                answer += cnt;
            }
        }
        return answer;
    }
}