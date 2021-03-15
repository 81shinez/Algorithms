package com.algo.kit.bfs_dfs.transformWord;

import java.util.HashSet;
import java.util.LinkedList;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        HashSet<String> isTraveled = new HashSet<>();
        LinkedList<String> nextStr = new LinkedList<>();

        nextStr.add(begin);

        while(!nextStr.isEmpty()){
            int size = nextStr.size();
            for(int i = 0; i < size; i++){
                String str = nextStr.pollFirst();
                if(str.equals(target)) return answer;
                for(String word : words){
                    int cnt = 0;
                    for(int idx = 0; idx < word.length(); idx++){
                        if(str.charAt(idx) == word.charAt(idx)){
                            cnt++;
                        }
                    }
                    if(cnt == str.length()-1 && !isTraveled.contains(word)){
                        isTraveled.add(word);
                        nextStr.add(word);
                    }
                }
            }
            answer++;
        }

        return 0;
    }
}