package com.algo.kit.bruteForce.findingPrimeNumber;

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    int cnt;
    HashSet<Integer> intSet = new HashSet<>();

    boolean isPrimeNum(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int idx = 3; idx <= Math.sqrt(num); idx += 2){
            if(num % idx == 0) return false;
        }
        return true;
    }

    void leftShift(ArrayList<String> strList, int start, int end){
        String startVal = strList.get(start);
        for(int idx = start; idx < end; idx++){
            strList.set(idx, strList.get(idx+1));
        }
        strList.set(end, startVal);
    }

    void rightShift(ArrayList<String> strList, int start, int end){
        String endVal = strList.get(end);
        for(int idx = end; idx > start; idx--){
            strList.set(idx, strList.get(idx-1));
        }
        strList.set(start, endVal);
    }

    void permutation(ArrayList<String> strList, int depth, int length, int targetDepth){
        if(depth == targetDepth) {
            String tmpString = "";
            for(int idx = 0; idx < targetDepth; idx++){
                tmpString = tmpString.concat(strList.get(idx));
            }
            int tmpInt = Integer.parseInt(tmpString);
            if(intSet.add(tmpInt)){
                if(isPrimeNum(tmpInt)){
                    cnt++;
                }
            }
            return;
        }
        for(int idx = depth; idx < length; idx++){
            rightShift(strList, depth, idx);
            permutation(strList, depth + 1, length, targetDepth);
            leftShift(strList, depth, idx);
        }
    }

    public int solution(String numbers) {
        cnt = 0;
        intSet.clear();
        ArrayList<String> strList = new ArrayList<>();

        for(int idx = 0; idx < numbers.length(); idx++){
            strList.add(numbers.substring(idx,idx+1));
        }

        for(int idx = 1; idx <= numbers.length(); idx++){
            permutation(strList, 0, numbers.length(), idx);
        }

        return cnt;
    }
}



