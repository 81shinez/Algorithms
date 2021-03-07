package com.algo.leetCode.shortEncodingOfWords;

//import java.util.HashSet;
//
//class Solution {
//    public int minimumLengthEncoding(String[] words) {
//        HashSet<String> indices = new HashSet<>();
//        int answer = 0;
//        for(String word : words){
//            for(String str : indices){
//                if(str.contains(word)){
//                    break;
//                }
//                if(word.contains(str)){
//                    answer -= str.length() + 1;
//                    indices.remove(str);
//                    indices.add(word);
//                    answer += word.length() + 1;
//                    break;
//                }
//                indices.add(word);
//                answer += word.length() + 1;
//
//            }
//        }
//
//        return answer;
//    }
//}

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int minimumLengthEncoding(String[] words) {
        int sum = 0;
        HashSet<String> indices = new HashSet<>(Arrays.asList(words));
        for(String word : words){
            for(int idx = 1; idx < word.length(); idx++){
                indices.remove(word.substring(idx));
            }
        }
        for(String str : indices){
            sum += str.length() + 1;
        }
        return sum;
    }
}