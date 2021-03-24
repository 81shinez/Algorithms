package com.algo.leetCode.threeSumWithMultiplicity;

import java.util.Arrays;

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int ans = 0;
        int MOD = 1000000007;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-2; i++){
            int j = i+1;
            int k = arr.length - 1;
            int forTarget = target-arr[i];
            while (j < k){
                if(arr[j] + arr[k] < forTarget) j++;
                else if(arr[j] + arr[k] > forTarget) k--;
                else if(arr[j] != arr[k]){
                    int cntJ = 1;
                    int cntK = 1;
                    while(j+1 < k && arr[j] == arr[j+1]){
                        j++;
                        cntJ++;
                    }
                    while (k-1 > j && arr[k] == arr[k-1]){
                        cntK++;
                        k--;
                    }
                    j++; k--;
                    ans += cntJ * cntK;
                    ans %= MOD;
                } else {
                    ans += (k-j+1) * (k-j) / 2;
                    ans %= MOD;
                    break;
                }
            }
        }

        return ans;
    }
//    public int threeSumMulti(int[] arr, int target) {
//        int ans = 0;
//        int MOD = 1000000007;
//        Arrays.sort(arr);
//        for(int i = 0; i < arr.length-2; i++){
//            for(int k = i+2; k < arr.length; k++){
//                for(int j = i+1; j < k; j++){
//                    if(arr[i]+arr[j]+arr[k] == target){
//                        ans++;
//                        ans %= MOD;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
}