package com.algo.kit.hash.failedRunner;


import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashmap = new HashMap<>();

        for(String str : completion){
            if(hashmap.get(str) == null){
                hashmap.put(str, 1);
            } else {
                hashmap.put(str, hashmap.get(str) + 1);
            }
        }

        for(String str : participant){;
            if(hashmap.get(str) == null){
                return str;
            } else {
                hashmap.put(str, hashmap.get(str) - 1);
            }
        }

        for(String key : hashmap.keySet()){
            if(hashmap.get(key) < 0){
                return key;
            }
        }

        return "";
    }
}