package com.algo.leetCode.reconstructOriginalDigitsFromEnglish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    void mapRemove(char c, HashMap<Character, Integer> stringMap){
        if(!stringMap.containsKey(c)) return;
        if(stringMap.get(c) == 1){
            stringMap.remove(c);
        } else {
            stringMap.replace(c, stringMap.get(c) - 1);
        }
    }
    public String originalDigits(String s) {
        ArrayList<Integer> answerList = new ArrayList<>();
        HashMap<Character, Integer> stringMap = new HashMap<>();
        for(int idx = 0; idx < s.length(); idx++){
            if(stringMap.containsKey(s.charAt(idx))){
                stringMap.replace(s.charAt(idx), stringMap.get(s.charAt(idx))+1);
            } else {
                stringMap.put(s.charAt(idx), 1);
            }
        }

        while (!stringMap.isEmpty()){
            if(stringMap.containsKey('z')) {
                answerList.add(0);
                mapRemove('z', stringMap);
                mapRemove('e', stringMap);
                mapRemove('r', stringMap);
                mapRemove('o', stringMap);
                continue;
            }
            if(stringMap.containsKey('w')) {
                answerList.add(2);
                mapRemove('t', stringMap);
                mapRemove('w', stringMap);
                mapRemove('o', stringMap);
                continue;
            }
            if(stringMap.containsKey('u')) {
                answerList.add(4);
                mapRemove('f', stringMap);
                mapRemove('o', stringMap);
                mapRemove('u', stringMap);
                mapRemove('r', stringMap);
                continue;
            }
            if(stringMap.containsKey('x')) {
                answerList.add(6);
                mapRemove('s', stringMap);
                mapRemove('i', stringMap);
                mapRemove('x', stringMap);
                continue;
            }
            if(stringMap.containsKey('g')) {
                answerList.add(8);
                mapRemove('e', stringMap);
                mapRemove('i', stringMap);
                mapRemove('g', stringMap);
                mapRemove('h', stringMap);
                mapRemove('t', stringMap);
                continue;
            }
            if(stringMap.containsKey('o')) {
                answerList.add(1);
                mapRemove('o', stringMap);
                mapRemove('n', stringMap);
                mapRemove('e', stringMap);
                continue;
            }
            if(stringMap.containsKey('t') || stringMap.containsKey('h') || stringMap.containsKey('r')) {
                answerList.add(3);
                mapRemove('t', stringMap);
                mapRemove('h', stringMap);
                mapRemove('r', stringMap);
                mapRemove('e', stringMap);
                mapRemove('e', stringMap);
                continue;
            }
            if(stringMap.containsKey('f')) {
                answerList.add(5);
                mapRemove('f', stringMap);
                mapRemove('i', stringMap);
                mapRemove('v', stringMap);
                mapRemove('e', stringMap);
                continue;
            }
            if(stringMap.containsKey('s')) {
                answerList.add(7);
                mapRemove('s', stringMap);
                mapRemove('e', stringMap);
                mapRemove('v', stringMap);
                mapRemove('e', stringMap);
                mapRemove('n', stringMap);
                continue;
            }
            answerList.add(9);
            mapRemove('n', stringMap);
            mapRemove('i', stringMap);
            mapRemove('n', stringMap);
            mapRemove('e', stringMap);
            continue;
        }

        Collections.sort(answerList);
        StringBuilder sb = new StringBuilder();
        for(int num : answerList){
            sb.append(num);
        }

        return sb.toString();
    }
}