package com.algo.leetCode.removePalindromicSubsequences;

class Solution {
    boolean isPal(String str){
        for(int idx = 0; idx < str.length()/2; idx++){
            if(str.charAt(idx) != str.charAt(str.length()-idx-1)) return false;
        }
        return true;
    }
    public int removePalindromeSub(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(isPal(s)){
            return 1;
        }
        return 2;
    }
}