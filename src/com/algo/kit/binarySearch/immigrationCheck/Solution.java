package com.algo.kit.binarySearch.immigrationCheck;

class Solution {
    public long solution(int n, int[] times){
        long left = 1;
        long right = (long)1000000000 * (long)1000000000;
        long mid;
        long answer = 1;
        long sum;



        //for(int intNum : times) if(intNum > right) right = intNum;

        while( right > left ){
            mid = (left + right) / 2;
            sum = 0;
            for(int num : times){
                sum += mid / num;
            }
            if(sum >= n){
                answer = mid;
                right = mid;
            } else if (sum < n){
                left = mid + 1;
            }
        }

        return answer;
    }
}