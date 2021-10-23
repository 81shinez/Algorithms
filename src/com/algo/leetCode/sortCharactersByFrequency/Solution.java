package com.algo.leetCode.sortCharactersByFrequency;

import java.util.*;

class Solution {
    private class Pair<L, R>{
        L left;
        R right;
        private Pair(L left, R right){
            this.left = left;
            this.right = right;
        }
    }

    public String frequencySort(String s) {
        char[] charArray = s.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char character : charArray){
            if(hashMap.containsKey(character)){
                hashMap.put(character, hashMap.get(character) + 1);
            } else {
                hashMap.put(character, 1);
            }
        }

        ArrayList<Pair<Character, Integer>> pairList = new ArrayList<>();

        for(char key : hashMap.keySet()){
            pairList.add(new Pair<>(key, hashMap.get(key)));
        }

        Collections.sort(pairList, (o1, o2) -> o2.right.compareTo(o1.right));

        StringBuffer sb = new StringBuffer();

        for(Pair<Character, Integer> pair : pairList){
            for(int i = 0; i < pair.right; i++){
                sb.append(pair.left);
            }
        }

        return sb.toString();
    }
}