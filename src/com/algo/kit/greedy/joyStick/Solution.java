package com.algo.kit.greedy.joyStick;

class Solution {
    class Pair<L, R>{
        L pointer;
        R cnt;
        Pair(L pointer, R cnt){
            this.pointer = pointer;
            this.cnt = cnt;
        }
    }

    Pair findClosest(int strPointer, String name){
        if(name.charAt(strPointer) != 'A') return new Pair(0, 0);
        int left = strPointer;
        int right = strPointer;
        int cnt = 0;
        for(int i = 0; i < name.length() / 2 + 1; i++){
            cnt++;
            if(right == name.length() - 1) right = 0;
            else right++;
            if(name.charAt(right) != 'A') return new Pair(right, cnt);
            if(left == 0) left = name.length() - 1;
            else left--;
            if(name.charAt(left) != 'A') return new Pair(left, cnt);
        }
        return new Pair(-1, cnt);
    }

    int countChar(char nameChar){
        if(nameChar == 'N') return 13;
        if(nameChar > 'N') return ('Z' + 1 - nameChar);
        if(nameChar < 'N') return (nameChar - 'A');
        return 0;
    }

    public int solution(String name) {
        int answer = 0;

        Pair<Integer, Integer> pair = new Pair<>(0,0);

        while(pair.pointer != -1){
            pair = findClosest(pair.pointer, name);
            if(pair.pointer == -1) break;
            else answer += countChar(name.charAt(pair.pointer));
            name = name.substring(0, pair.pointer).concat("A").concat(name.substring(pair.pointer+1));
            answer += pair.cnt;
        }
        return answer;
    }
}