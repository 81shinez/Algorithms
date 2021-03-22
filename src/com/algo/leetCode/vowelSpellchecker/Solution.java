package com.algo.leetCode.vowelSpellchecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        LinkedHashSet<String> wordSet = new LinkedHashSet<>();
        HashMap<String, String> vowelMap = new HashMap<>();
        HashMap<String, String> upperMap = new HashMap<>();

        for(String word : wordlist){
            wordSet.add(word);
            upperMap.putIfAbsent(word.toUpperCase(), word);
            vowelMap.putIfAbsent(word.replaceAll("[AaEeIiOoUu]", "*").toUpperCase(), word);
        }

        ArrayList<String> ansList = new ArrayList<>();
        for(String query : queries){
            if(wordSet.contains(query)) {
                ansList.add(query);
                continue;
            }

            if(upperMap.containsKey(query.toUpperCase())){
                ansList.add(upperMap.get(query.toUpperCase()));
                continue;
            }

            String str = query.replaceAll("[AaEeIiOoUu]", "*");
            if(vowelMap.containsKey(str.toUpperCase())){
                ansList.add(vowelMap.get(str.toUpperCase()));
                continue;
            }

            ansList.add("");
        }
        return ansList.toArray(new String[0]);
    }
}